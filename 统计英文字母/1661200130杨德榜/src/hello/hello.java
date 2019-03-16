package hello;

import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ‰»Î£∫");
		String str = sc.nextLine();
			char chs[]=str.toCharArray();

			   for(char ch = (char) 000; ch<=(char) 255; ch++)
			       {
				int count = 0;
				for (char ch1 : chs)
				{
				     if(ch == ch1)
				      {
				          count++;
				      }
				}
			       if(count!=0)
			    {
			         System.out.println( ch +"”–"+ count +"∏ˆ");
			    }
			       }
			}

		
}


