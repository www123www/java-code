import java.util.Scanner;

public class Mian {
	public static void main(String[] srgs)

	{
	     Scanner en = new Scanner(System.in);
	     System.out.println(" ‰»Î£∫");
	     String str = en.nextLine();
	     char head[]=str.toCharArray();

	   for(char mo = (char) 000; mo<=(char) 255; mo++)
	       {
		int count = 0;
		for (char ci : head)
		{
		     if(mo == ci)
		      {
		          count++;
		      }
		}
	       if(count!=0)
	    {
	         System.out.println( mo +"¥Ê‘⁄"+ count +"∏ˆ");
	    }
	       }
	}
}
