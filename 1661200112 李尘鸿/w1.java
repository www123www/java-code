import java.util.*;
public class w1 {
  public static void main(String args[]){
                 System.out.println("输入：");
	  Scanner reader = new Scanner(System.in);
	  String s= reader.nextLine();
		int [] a=new int [26];
	  
		for(int i=0;i<s.length();i++) 
		{
			char x=s.charAt(i);
			if(x>='a'&&	x<='z'	) 
			{
			int index=x-'a';
			a[index]=a[index]+1;	
			}

		}
		for(int j=0;j<a.length;j++) 
		{
			System.out.println("字母："+(char)(j+'a')+"出现：:"+a[j]+"次");	
		}
	}
  }

