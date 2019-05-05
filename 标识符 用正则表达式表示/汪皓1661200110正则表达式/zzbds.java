package zz;
import java.util.Scanner;
public class zzbds {
	public static void main(String args[]){
		String regex="[a-zA-Z|_|$|]+[a-zA-Z|0-9|_|$]*";
		Scanner sca=new Scanner(System.in);
		String str=sca.nextLine();
		
		if(str.matches(regex)){
			System.out.println(str+"标识符合法");
		}
		else{
			System.out.println(str+"标识符不合法");
		}
	}
}
