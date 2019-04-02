package class03_26_2;

import java.util.Scanner;

//通讯录
class AddressBook{
	int number;
	String name;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class AddressList {
	private static final String NULL = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddressBook book[] = new AddressBook[3];
		int i=0;
		while(i!=-1){
			System.out.println("1.增加通讯录\n"+"2.查询通讯录"+"\n请选择：");
			switch (sc.nextInt()) {
			case 1:
				for(int s=0;s<book.length;s++){
					System.out.println("请输入第"+(s+1)+"个用户：");
					book[s] = new AddressBook();
					System.out.print("姓名：");
					book[s].name = sc.next();
					System.out.print("手机号：");
					book[s].number = sc.nextInt();
				}
				break;
			case 2:
				System.out.println("请输入查询的用户姓名：");
				String name = sc.next();
				int z=1;
				
				for(int s=0;s<book.length&&book[s]!=null;s++){
					if(book[s].getName().equals(name)){
						System.out.println("用户姓名："+book[s].name+"\n用户电话："+book[s].number);
						z=1;
						break;
					}else{
						z=0;
					}
				}
				if(z==0){
					System.out.println("没有查找到该用户！");
				}
				break;
			case 0:
				i=-1;
				break;
			default:
				i=-1;
				System.out.println("选项有误,退出系统！");
				break;
			}
		}
	}
}