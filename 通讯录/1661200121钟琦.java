import java.util.HashMap;
import java.util.Scanner;
class Stu{
	String name;
	int num;
}
public class Tongxunlu {
    public static void main(String []args) {
       Scanner s = new Scanner(System.in);
	   Stu stu[] = new Stu[3];
		System.out.println("请输入要在通讯录添加的姓名和电话：");
		for(int i = 0;i<stu.length;i++){
			stu[i] = new Stu();
			stu[i].name = s.next();
			stu[i].num = s.nextInt();
		}
		
		for(int i = 0;i<stu.length;i++){
			System.out.println("姓名："+stu[i].name+"电话："+stu[i].num);
		}
		
		System.out.println("请输入要查询的姓名：");
		String b = s.next();
		boolean d = false;
		
		for(int i = 0;i<stu.length;i++){
			if(b.equals(stu[i].name)){
				System.out.println("姓名："+stu[i].name+"电话："+stu[i].num);
				d = false;
				break;
			}
			else{
				d = true;
			}
		}
		
		if(d == true){
			System.out.println("未查找到联系人！");
		}
	   
    }
}