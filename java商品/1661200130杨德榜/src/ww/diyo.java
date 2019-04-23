package ww;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class diyo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String cz=sc.next();
		shangpin bo[]={new diannao(5000,"电脑"),new shouji(3000,"手机")};
		Pattern pat=Pattern.compile(cz);
		for(int c=0;c<bo.length;c++)
		{
			Matcher mat=pat.matcher(bo[c].getName());
			if(mat.find()){
				System.out.println("商品信息"+bo[c].getName()+bo[c].getPrice());	
			}
		}
	}
	
	

}
