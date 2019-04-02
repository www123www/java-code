package zuoye;

import java.util.Scanner;

public class x {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		dong a=new dong();
		System.out.println("选择动物:L狮子(5,5)W狼(1,1)R兔子(2,2)");
		String s1=sc.nextLine();
		System.out.println("东D南N西X北B");
		String s=sc.nextLine();
		while(s!="0")
		{
			switch(s){
			case "D":
				a.d(s1);
				a.ci();
				break;
			case "X":
				a.x(s1);
				a.ci();
				break;
			case "N":
				a.n(s1);
				a.ci();
				break;
			case "B":
				a.b(s1);
				a.ci();
				break;
				
			}
			System.out.println("选择动物:L狮子W狼R兔子");
			s1=sc.nextLine();
			System.out.println("东D南N西X北B");
			s=sc.nextLine();
		}

		

}
}