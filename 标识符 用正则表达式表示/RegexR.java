import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexR {
	/**
     * 判断一个字符串是否为合法标识符
     * [a-zA-Z]\w{3,14}
     * @param string
     * @return
     */
    public static boolean isJudgmentIdentifier(String string) {
        if (string == null)
            return false;
        Pattern pattern = Pattern.compile("[a-zA-Z]\\w{3,14}");
        return pattern.matcher(string).matches();
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String str=null;
    	System.out.println("请输入一个字符串：");
    	str=sc.next();
    	if(isJudgmentIdentifier(str)) {
    		System.out.println(str+"是合法标识符");
    	}else
    	{
    		System.out.println(str+"不是合法标识符");
    	}
    }
	
}
