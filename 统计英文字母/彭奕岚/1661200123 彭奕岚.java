package index;
import java.util.*;
public class ins {
	public static void main(String args[])
	{
		String a = "sdfalhasl";
		for(int i = 65;i<123;i++){
			int count = 0;
			for(int j = 0;j<a.length();j++)
			{
				if(i==a.charAt(j)){
					count++;
				}
			}
			if(count != 0){
				System.out.println((char)i+":出现了"+count+"次");
			}
		}
	}
}
