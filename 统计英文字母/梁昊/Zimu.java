package huoquzimu;
import java.util.Scanner;

public class Zimu {
public static void main(String arg[]) {
	String s="aaaabcfgg";
	int [] a=new int [26];
	 s=s.toLowerCase();
	for(int i=0;i<s.length();i++) 
	{
		char x=s.charAt(i);
		
		int index=x-'a';
		System.out.println(index);
		a[index]=a[index]+1;
	}
	for(int j=0;j<a.length;j++) 
	{
		System.out.println("×ÖÄ¸£º"+(char)(j+'a')+"³öÏÖ£º:"+a[j]+"´Î");	
	}
}
}
