
import java.util.Scanner;


public class Test 
{
	public static void main(String[] args){
		System.out.print("请输出一串字符串：");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		countCharNumber(str);
	}
	/**
	 * 统计字符串中的每个字母出现的次数
	 * @param str
	 */
	public static void countCharNumber(String str) {
		int[] nums = new int[26];//创建26个空间大小的数组
		str = str.toLowerCase();//转小写
		//"hello" 转 {'h','e','l','l','o'}
		char[] chars = str.toCharArray();//字符串 转 字符数组
		for(char ch: chars) {
			if(ch>=97 && ch<=122) {
				nums[ch-97]++;
			}
		}
		for(int index = 0; index<nums.length; index++) {
			if(nums[index] != 0) {
				System.out.println((char)(index+97) + "出现的次数为：" + nums[index]);
			}
		}
	}
}