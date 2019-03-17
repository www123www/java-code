
import java.util.Scanner;
public class StringName  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[26];
        System.out.println("请输入字符");
        String str=sc.nextLine();
        str=str.trim().toLowerCase();//去掉前后空格并且全转为小写字母

        
        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            int index=c-'a';
            a[index]=a[index]+1;
        }
        
        for (int i = 0; i < a.length; i++)
        {
            if(a[i]!=0)
            {
                System.out.println("字母"+(char)(i+'a')+"出现:"+a[i]+"次");
            }
        }
    }
}