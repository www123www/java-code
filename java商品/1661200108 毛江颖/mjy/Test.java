package mjy;

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

		Commodity c1 = new Computer("联想电脑", 6500);
		Commodity c2 = new Computer("苹果电脑", 8000);
		Commodity c3 = new Bijiben("苹果笔记本", 9000);
		Commodity c4 = new Bijiben("华硕笔记本", 5500);

		Commodity[] c = { c1, c2, c3, c4 };
		String sr;
		System.out.println("请输入要查找的二手商品的名称部分信息：");
		Scanner sc = new Scanner(System.in);
		sr = sc.nextLine();
		search(sr, c);
	}
}
