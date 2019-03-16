package zy2019_3_5;

import java.util.Scanner;

public class Zy01 {
	public static void countS(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) { // 遍历字符串
			char ch = s.charAt(i);
			if (Character.isLetter(ch)) { // 如果为字母，计数器加1
				count++;
			}
		}
		System.out.println("\n字符串中字母的个数为" + count + "个\n");

		char ch[] = s.toCharArray(); // 将字符串逐个存到字符数组中

		int count1 = 0;
		for (char i = 'a'; i < 'z'; i++) {
			count1 = 0;// 每执行一次循环让计数器重新归零，否则会进行累加
			for (int j = 0; j < ch.length; j++) {// 遍历字符串数组并进行判断
				if (i == ch[j]) { // 如果为小写字母，计数器加1
					count1++;
				}
			}
			if (count1 != 0) {// 如果当前循环计数器不为0，打印这个字母及它的个数
				System.out.println("字符串中小写字母" + i + "有" + count1 + "个!");
			}
		}
		System.out.println("\n");

		int count2 = 0;
		for (char i = 'A'; i < 'Z'; i++) {
			count2 = 0;// 每执行一次循环让计数器重新归零，否则会进行累加
			for (int j = 0; j < ch.length; j++) {// 遍历字符串数组并进行判断
				if (i == ch[j]) { // 如果为大写字母，计数器加1
					count2++;
				}
			}
			if (count2 != 0) {// 如果当前循环计数器不为0，打印这个字母及它的个数
				System.out.println("字符串中大写字母" + i + "有" + count2 + "个!");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("请输入一个字符串:");
		while (true) {
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			if (s.length() != 0) {// 如果字符串长度不为0，执行countS函数
				countS(s);
				break;
			} else {
				System.out.println("请重新输入字符串(不能为空):");
			}
		}
	}
}
