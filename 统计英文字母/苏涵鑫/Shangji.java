package ono;
import java.util.Scanner;

public class Shangji {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in); 
	System.out.println("ÇëÊäÈë×Ö·û£º");
	String s = sc.next();
int[] num = new int[126];
for(int i = 0;i < s.length();i++){
    num[s.charAt(i)-' ']++; 
}
	
	for(int i = 0;i < 126;i++){
	   if(num[i] > 0){
	      System.out.println((char)(i +' ') +" " + num[i] + "¸ö"); 
	   }
	}
  }
}