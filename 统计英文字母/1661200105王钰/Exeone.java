
import java.util.Scanner;


public class Exeone 
{
  
	public static void main(String[] args){
		System.out.print("请输出一串字符串：");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		countCharNumber(str);
	}
	/**
	 * 统计字符串中的每个字符出现的次数
	 * @param str
	 */
	public static void countCharNumber(String str) {
		int[] nums = new int[52];//创建52个空间大小的数组，存放52个字母出现的次数（小写+大写=52个）
		char[] chars = str.toCharArray();
		for(char ch: chars) {
			if(ch >= 65 && ch<=90) {
				nums[ch-65]++;
			}else if(ch>=97 && ch<=122) {
				int index = ch - 71;
				nums[index]++;
			}
		}
		for(int index = 0; index<nums.length; index++) {
			char ch;
			if(nums[index] != 0) {
				if(index < 26) {
					ch = (char)(index+65);
				}else{
					ch = (char)(index+71);
				}
				System.out.println(ch + "出现的次数为：" + nums[index]);
			}
		}
	}
}