package ww;

public class diannao implements shangpin {
	double pri;
	String name;
	diannao(double pri,String name){
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
