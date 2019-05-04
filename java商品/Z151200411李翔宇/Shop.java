package shop;

import java.util.Scanner;

public class Shop {
    int num;
    AbstractGoods[] as;
    Scanner rd = new Scanner(System.in);

    public Shop()
    {
        as = new Goods[2];
    }

    public void InputGoods()
    {
        String name;
        double price;
        System.out.println("录入2种商品数据");
        for(int i = 0;i<2;i++)
        {
            System.out.println("输入商品名称：");
            name = rd.next();
            System.out.println("输入商品价格：");
            price = rd.nextDouble();
            as[i] = new Goods(name,price);
        }

    }

    public void Print(String str, SecondhandGoods sg) {
        System.out.println("商品名：" + sg.getName());
        System.out.println("价格：" + sg.getPrice());

    }

    public void Query() {
        String goods;
        System.out.println("输入要查找的商品");
        goods = rd.next();

        for(int i=0;i<2;i++)
        {
            if ( goods.equals(as[i].getName()))
            {
                Print(goods,as[i]);
                return;         
            }           
        }
        System.out.println("没有这类商品");
    }
}