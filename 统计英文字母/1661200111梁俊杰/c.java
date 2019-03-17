import java.util.Scanner;

//输入一串字符串，检测里面字符串中每个字符出现的次数。
public class c 
{
    public static void main(String []args) 
    {
    	System.out.println("请输入一串字符串：");
    	Scanner sr=new Scanner(System.in);
		String text=sr.next();
		int[] temp=new int[26];
    	for(int i=0;i<text.length();i++)
    	{
    		char tmp=text.charAt(i);
    		int index=tmp-97;
    		if(index>=0)
    		{
    			temp[index]++;  			
    		}
    	}
    	for(int j=0;j<26;j++)
    	{
    		if(temp[j]!=0)
    		{
    			System.out.println("字母"+(char)(j+97)+"出现次数"+temp[j]);
    		}
    	}
    }
}
