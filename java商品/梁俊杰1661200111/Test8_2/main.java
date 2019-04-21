package Test8_2;

import java.util.Scanner;

public class main {
	public static void main(String[] args) 
	{
		Shop shop=new Shop();
		Message message=null;
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入添加的商品名称:");
		System.out.println("请输入添加的商品价格:");
		message=new Computer(scanner.next(), scanner.nextInt());
		shop.TJ(message);
		System.out.println("请输入添加的商品名称:");
		System.out.println("请输入添加的商品价格:");
		message=new Computer(scanner.next(), scanner.nextInt());
		shop.TJ(message);

		System.out.println("请输入要查询的商品名称:");
		shop.GetVolume(scanner.next());
		
		//System.out.println("----------------");
	}
}
