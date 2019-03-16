import java.util.Scanner;
public class Zzh {
    public static void main(String []args) {
Scanner reader=new Scanner(System.in);
		String x=reader.next();
		int length=x.length();
		for (int i = 97; i < 123; i++) 
		{
			int count = 0;
			for (int j = 0; j < length; j++) 
			{
				if (i == x.charAt(j)) 
				{
					count++;
				}
			}
			if (count != 0) 
			{
				System.out.println((char) i + "£º" + count);
			}
		}
      
       
    }
}
