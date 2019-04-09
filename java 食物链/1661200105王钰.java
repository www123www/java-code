package homework;
import java.util.Random;
import java.util.Scanner;

public class work {
	//设置区域
	static int X = 3;
	static int Y = 3;
	public static void main(String args[]){
		Lion lion = new Lion("老虎", X, Y, 3, "★");
		Wolf wolf = new Wolf("狼", X, Y, 2, "☆");
		Rabbit rabbit = new Rabbit("兔子", X, Y, 1, "◇");
		System.out.println(lion.name + lion.flag + "  " + wolf.name + wolf.flag + "  "+ rabbit.name + rabbit.flag);
		printWall();
		Animal[] animals = new Animal[] {lion, wolf, rabbit};//动物集合
		Africa africa = new Africa(animals, X, Y);//	非洲区域
		africa.actions();//动物移动一次
		africa.display();//打印显示现在每个动物移动的位置
		printWall();
		for (int i = 0; i < animals.length; i++) {
			System.out.printf("%s%s(%d,%d)  ",animals[i].name, animals[i].flag,animals[i].x, animals[i].y);
		}
		for (int i = 0; i < animals.length; i++) {
			if(!animals[i].show) {
				System.out.printf("\n%s%s被吃掉了",animals[i].name, animals[i].flag);
			}
		}
	}
	
	//打印隔离带
	static void printWall() {
		for (int i = 0; i < X; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}

/**
 * 动物类 基类
 */
class Animal{
	String name;
	boolean show = true;	//默认显示出来，没被吃掉
	int maxX;//区域的长
	int maxY;//区域的宽
	int level;			//每种动物的等级
	String flag;		//每个动物的图标
	int x,y;			//在区域内的坐标
	
	/**
	 * 
	 * @param 等级
	 * @param 图标
	 */
	Animal(String name, int maxX, int maxY, int level, String flag){
		this.name = name;
		this.maxX = maxX;
		this.maxY = maxY;
		this.level = level;
		this.flag = flag;
	}
	
	/**
	 * 随机移动
	 */
	void move()
	{
		x = (int)(Math.random()*maxX);
		y = (int)(Math.random()*maxY);
	}
	
	/**
	 * 比较XY
	 * @param 另一个动物
	 * @return 如果当前动物与另一个动物在同一坐标上就返回true
	 */
	boolean compareXY(Animal ani) {
		return (this.x == ani.x && this.y == ani.y);
	}
	
	/**
	 * 比较等级
	 * @param 另一个动物
	 * @return 如果当前动物等级大于另一个动物等级就返回true
	 */
	boolean compareLevel(Animal ani) {
		return this.level > ani.level;
	}
}

/**
 * 狮子
 */
class Lion extends Animal{

	Lion(String name, int maxX, int maxY, int level, String flag) {
		super(name, maxX, maxY, level, flag);
	}
	
}

/**
 * 狼
 */
class Wolf extends Animal{

	Wolf(String name, int maxX, int maxY, int level, String flag) {
		super(name, maxX, maxY, level, flag);
	}

}

/**
 * 兔子
 */
class Rabbit extends Animal{

	Rabbit(String name, int maxX, int maxY, int level, String flag) {
		super(name, maxX, maxY, level, flag);	}

}

/**
 * 非洲
 */
class Africa{
	static int X;//区域长
	static int Y;//区域宽
	String[][] area;//区域 二维的
	Animal[] animals;
	
	Africa(Animal[] animals, int x, int y){
		this.animals = animals;
		this.X = x;
		this.Y = y;
	}
	
	/**
	 * 移动每个动物的坐标
	 */
	public void actions() {
		for (int i = 0; i < animals.length; i++) {
			if(animals[i].show) {//除去已经被吃掉的动物
				animals[i].move();	//移动每个动物的坐标	
				isEat(i);
				
			}
		}
	}
	
	/**
	 * 判断是否被吃掉
	 */
	private void isEat(int curIndex) {
		//1.先判断是否在同一坐标上
		for (int i = 0; i < animals.length; i++) {
			//除去自己本身
			if(i != curIndex) {
				if(animals[i].show) {//没被吃掉的动物
					if(animals[curIndex].compareXY(animals[i])) {
						//在同一个坐标
						if(animals[curIndex].compareLevel(animals[i])) {
							animals[i].show = false;//大于的话就对方被吃掉
						}else {
							animals[curIndex].show = false;//小于就自己被吃掉
						}
					}
				}
			}
		}
	}
	
	/**
	 * 显示动物的位置
	 */
	public void display() {
		area = new String[X][Y];//创建一个新的区域
		for (int i = 0; i < animals.length; i++) {
			if(animals[i].show) {//被吃掉的动物就不显示了
				//在区域内设置动物的图标
				area[animals[i].x][animals[i].y] = animals[i].flag;
			}
		}
		
		for (int i = 0; i < X; i++) {
			for (int j = 0; j < Y; j++) {
				if(area[i][j] == null) {//空的坐标就用空格表示
					System.out.print(" ");
				}else {//在当前坐标上有动物就打印出它的图标
					System.out.print(area[i][j]);
				}
			}
			System.out.println();//换行
		}
	}
}
