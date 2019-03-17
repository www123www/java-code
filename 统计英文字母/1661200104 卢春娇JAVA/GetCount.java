import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetCount {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();     //读取数据

		int[] counts = count(str.toLowerCase());    //将大写字符转换为小写
		String frequency = "";  
		for(int i=0;i<counts.length;i++){  
			if(counts[i]!=0)  //判断字母出现的次数是否不为0次
				frequency +=(char)('a'+i)+":"+counts[i]+"次\n"; 
		}  
		System.out.println(frequency);  
	}  

	public static int[] count(String s){
		int[] ch = new int[26];  //定义一个长度为26的int型数组
		for(int i=0;i<s.length();i++){
			if(Character.isLowerCase(s.charAt(i)))   //判断是否是小写字母
				ch[s.charAt(i)-'a']++;
		}  
		return ch;  
	}  
}


