import java.util.Scanner;

public class Stri {

	public static void main(String[] args) {
		String a = "[a-zA-Z]+[A-Az-z|0-9]*\\w{3,14}";
		System.out.println("输入一串字符...");
		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();
		if(str.matches(a){
			System.out.println(str+"合法");
		}
		else{
			System.out.println(str+"不合法");
		}
	}

}
