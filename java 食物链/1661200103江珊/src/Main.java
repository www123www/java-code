import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Eat eat=new Eat();
        eat.show();
        int i;//选择动物
        int direction;
        System.out.println("输入移动的动物 1.狮子 2.狼 3.兔子 ");
        i=scanner.nextInt();
        if (i==0){//输入0结束
            return;
        }
        System.out.println("移动的方向 1.上 2.下 3.左 4.右:");
        direction=scanner.nextInt();//选择方向
        while (true){
            eat.choice(i,direction);
            eat.show();
            System.out.println("输入控制的动物 1.狮子 2.狼 3.兔子 0.结束:");
            i=scanner.nextInt();
            if (i==0) return;
            System.out.println("移动的方向 1.上 2.下 3.左 4.右:");
            direction=scanner.nextInt();
        }

    }
}
