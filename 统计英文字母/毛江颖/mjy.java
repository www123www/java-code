package zy2019_3_5;

import java.util.Scanner;

public class mjy {
	public static void main(String[] args) {
		System.out.println("请输入一个字符串:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;
		for (int i = 0; i < s.length(); i++) { // 遍历字符串
			char ch = s.charAt(i);
			if (Character.isLetter(ch)) { // 如果为字母，计数器加1
				count++;
			}
		}
		System.out.println("\n字符串中字母的个数为" + count + "个\n");
	}

}
