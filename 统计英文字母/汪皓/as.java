import java.util.Scanner;
public class as {
	public static void main (String args[]){
		System.out.println("请输入：");
		/*System.out.println("请按");*/
		Scanner string=new Scanner(System.in);
		String x=string.next();	
		char chs[]= x.toCharArray();
		int num=0;
		
		System.out.println("字符串的字符个数："+chs.length);
		
		for(char ch='a';ch<'z';ch++)
		{
			num=0;
			for(int i=0;i<chs.length;i++)
			{
				if(ch==chs[i])
					num++;
			}
			if(num!=0)
				System.out.println("字符中"+ch+"有:"+num+"个");
		}
		
		for(char ch='A';ch<'Z';ch++)
		{
			num=0;
			for(int i=0;i<chs.length;i++)
			{
				if(ch==chs[i])
					num++;
			}
			if(num!=0)
				System.out.println("字符中"+ch+"有:"+num+"个");
		}
		
		for(char ch='0';ch<'9';ch++)
		{
			num=0;
			for(int i=0;i<chs.length;i++)
			{
				if(ch==chs[i])
					num++;
			}
			if(num!=0)
				System.out.println("字符中"+ch+"有:"+num+"个");
		}
		
	}
}
