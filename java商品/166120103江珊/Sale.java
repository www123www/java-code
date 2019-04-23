package chap6;
import java.util.Scanner;


public class Sale {//二手商店类
 Message goods[];
	Sale(){
		Scanner read=new Scanner(System.in);
		String x =read.next();
	}
	public String getMessage(){
		return "商品信息";
	}
}
