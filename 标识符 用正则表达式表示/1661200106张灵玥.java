import java.util.Scanner;

public class biaoshifu {

	public static void main(String[] args) {
		String regex = "[a-zA-Z]+[A-Az-z|0-9]*\\w{3,14}";
		Scanner scanner = new Scanner(System.in); 
		String str = scanner.nextLine();
		if(str.matches(regex)){
			System.out.println(str+"合法标识符");
		}
		else{
			System.out.println(str+"非法标识符");
		}
	}

}
