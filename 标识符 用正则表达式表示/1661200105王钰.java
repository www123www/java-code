package wangyu;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class password {
	static Pattern p = null; // 正则表达式
	static Matcher m = null; // 操作的字符串
	static boolean b = false; // 布尔值
	public static void main(String[] args) {
		for (int i = 1; i > 0; i++) {
			Scanner input = new Scanner(System.in);	
			System.out.print("请输入密码：");
			String pw = input.next();
			if (pword(pw)) {
				System.out.println("匹配正确！");
				break;
			}
		}
	}
	private static boolean pword(String pw) {
		p = Pattern.compile("[a-zA-Z]\\w{3,14}");
		m = p.matcher(pw);
		b = m.matches();
		if (b == false) {
			System.out.println("匹配不正确，第一个字符必须是字母；"
					+ "密码不能包含除字母、数字、下划线以外的字符；最少4个字符且不超过15个字符");
			return false;}
		return true;	}

}
