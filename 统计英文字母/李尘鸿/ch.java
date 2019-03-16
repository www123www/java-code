package hq;
import java.util.Scanner;

public class ch {
	public static void main (String args[]) {
		
		String l="aabcbghfhh";
		int [] a=new int [26];
		for(int i=0;i<l.length();i++) 
		{
			char c=l.charAt(i);
			int index=c-'a';
			System.out.println(index);
			a[index]=a[index]+1;
		}
		for(int j=0;j<a.length;j++) 
		{
			System.out.println("字母："+(char)(j+'a')+"出现次数：:"+a[j]);	
		}
	}
}

