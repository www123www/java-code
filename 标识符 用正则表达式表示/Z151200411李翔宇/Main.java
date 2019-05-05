package r;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

public static void main(String[] args) {

	String regular;
	String tag;
	Scanner input = new Scanner(System.in);
	regular = "^[0-9| a-z | A-Z | _ | $]*$";
	System.out.print("输入需要匹配的字符串：");
	tag = input.next();
    Pattern p = Pattern.compile(regular);
    Matcher m = p.matcher(tag);
    System.out.println(m.matches());
	  }
}
