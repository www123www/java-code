import java.util.Scanner;
public class as {
	public static void main (String args[]){
		System.out.println("可以统计小写字符以及其他无效字符");
		System.out.println("请输入：");
		/*System.out.println("请按");*/
		Scanner string=new Scanner(System.in);
		String x=string.next();	
		char chs[]= x.toCharArray();
		int num=0;
		int num1=0;
		int num2=0;
		
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
					num1++;
			}
			
		}
		
		for(char ch='0';ch<'9';ch++)
		{
			num=0;
			for(int i=0;i<chs.length;i++)
			{
				if(ch==chs[i])
					num2++;
			}
			
			
		}
		int num3=num1+num2;
		if(num3!=0)
			System.out.println("无效字符有:"+num3+"个");
	}
}
