package ww;

public class shouji implements shangpin{
	double pri;
	String name;
	shouji(double pri,String name){
		this.pri=pri;
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public double getPrice(){
		return pri;
	}

}
