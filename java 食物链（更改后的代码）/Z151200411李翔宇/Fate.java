package Animegai;
import java.util.Scanner;

public class Fate 
{
	final int Length = 5;
	final int Width = 5;

	int size = 3;
	int num;
    Grand[] ind;
    Scanner rd = new Scanner(System.in);

    Fate() 
    {
        ind = new Grand[size];
    }

    void Menu() 
    {
        System.out.println("1.创建动物并生成坐标");
        CreateMember();
        System.out.println("2.输入移动次数");
        SetNum();
        System.out.println("3.开始移动");
        System.out.println("移动顺序为：兔子，狼，狮子");
 
        //判断动物是否存活，若存活则移动，否则跳过
        for (int i = 0; i < num; i++) 
        {
            System.out.println("第" + (i + 1) + "回合：");
            for (int j = 0; j < size; j++) 
            {
                if (ind[j].getSpecies().equals("兔子")) 
                {
                    if (ind[j].getLife() == true) 
                    {
                        Move(ind[j]);
                        Judge(ind[j]);
                    }
                }
            }
            for (int j = 0; j < size; j++) 
            {
                if (ind[j].getSpecies().equals("狼"))
                {
                    if (ind[j].getLife() == true) 
                    {
                        Move(ind[j]);
                        Judge(ind[j]);
                    }
                }
            }
            for (int j = 0; j < size; j++) 
            {
                if (ind[j].getSpecies().equals("狮子")) 
                {
                    if (ind[j].getLife() == true) 
                    {
                        Move(ind[j]);
                        Judge(ind[j]);
                    }
                }
            }
            System.out.println(" ");
        }
    }

	void CreateMember() 
	{
        String a;
        for (int i = 0; i < size; i++) 
        {
            System.out.println("创建第" + (i + 1) + "个动物:");
            System.out.println("输入种类(兔子，狼，狮子)：");
            a = rd.next();
            ind[i] = new Grand(a, Length, Width);
            System.out.println(ind[i].getSpecies() + "的坐标为：(" + ind[i].getX() + "," + ind[i].getY() + ")");        
        }
    }

	void SetNum() 
	{
        System.out.println("输入移动回合数：");
        num = rd.nextInt();
    }

	void Move(Grand a) 
	{
        if (a.getLife() == true) 
        {
            System.out.println(a.getSpecies() + " 开始移动");
            a.SetBirthplace(Length, Width);
            System.out.println("移动后的坐标为：(" + a.getX() + "," + a.getY() + ")");
        }
    }

	void Judge(Grand a) 
	{
        for (int i = 0; i < size; i++) 
        {
            if (ind[i].getLife() == true) 
            {
                if (a.getSpecies() == ind[i].getSpecies()) 
                    continue;
                else 
                {
                    if (a.getX() == ind[i].getY() && a.getY() == ind[i].getY())
                    {
                        if (a.getRank() > ind[i].getRank()) 
                        {
                            System.out.println(a.getSpecies() + "被" + ind[i].getSpecies() + "吃掉了");
                            a.setLife(false);
                        }
                        if (a.getRank() < ind[i].getRank()) 
                        {
                            System.out.println(a.getSpecies() + "吃掉了" + ind[i].getSpecies());
                            ind[i].setLife(false);
                        }
                    }
                }
            }
        }
    }
}
