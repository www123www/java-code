package ovo;

import java.util.Scanner;

public class CO {
public static void main(String[] args) {
	Scanner SC =new Scanner(System.in); 
	System.out.println("请输入一串英文字母：");
	String s = SC.next();
    int[] num = new int[126];
    for(int x = 0;x < s.length();x++){
    num[s.charAt(x)-' ']++; 
}
	for(int i = 0;i < 126;i++){
	   if(num[i] > 0){
		   System.out.println("具体个数为：");
	      System.out.println((char)(i +' ') +" " + num[i] + "个"); 
	   }
	}
  }
}
