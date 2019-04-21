package src.wr;

public class computer implements SP {

	String a;int b;
	public computer(String a,int b){
		this.a=a;
		this.b=b;
	}
	public String getname() {
		this.a=a;
		return a;
	}

	
	public double getprice() {
		this.b=b;
		return b;
	}
	

}

class TV implements SP {

	String a;	int b;
	public TV(String a,int b){
		this.a=a;
		this.b=b;
	}
	public String getname() {
		this.a=a;
		return a;
	}


	public double getprice() {
		this.b=b;
		return b;
	}
	

}
