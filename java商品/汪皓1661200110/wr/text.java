package src.wr;

public class text {

public static void main(String args[]){
		Shop shop =new Shop() ;
		SP sp;
		sp=null;
		sp=new computer("笔记本电脑",2000);
		shop.JR(sp);
		sp=new computer("台式电脑",2000);
		shop.JR(sp);
		sp=new TV("hh",1477);
		shop.JR(sp);
		shop.jl("h");
		
	}
}