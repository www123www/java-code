package zy;

import java.util.Scanner;

public class Test {
	static void search(String ss, Commodity[] c) {
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i].name.contains(ss) == true) {
				System.out.println(c[i].name + "----" + c[i].price);
				count++;
			} else {
				if (count == 0 && i == c.length - 1) {
					System.out.println("商店里不存在这样的商品");
				}
			}
		}
	}

	public static void main(String[] args) {

		Commodity c1 = new Computer("平板电脑", 3000);
		Commodity c2 = new Computer("台式电脑", 5000);
		Commodity c3 = new Bijiben("小号笔记本", 10);
		Commodity c4 = new Bijiben("大号笔记本笔记本", 8);

		Commodity[] c = { c1, c2, c3, c4 };
		String sr;
		System.out.println("请输入要查找的二手商品的名称部分信息：");
		Scanner sc = new Scanner(System.in);
		sr = sc.nextLine();
		search(sr, c);
	}
}
