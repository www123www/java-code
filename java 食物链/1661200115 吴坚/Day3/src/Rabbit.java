
public class Rabbit extends Animal{
	String name;
	Animal n=new Animal();
	
	void move(int x,int y) {	  
    	  setX(x);
    	  setY(y);
      }
	//-----------------------
	void setX(int x) {
		n.x=x;
		
	}
	void setY(int y) {
		n.y=y;
	}
	int  getX() {
		return n.x;
	}
	
	int  getY() {
		return n.y;
	}
	//------------------
	void pritln() {
		System.out.println("Rabbit µÄ×ø±ê x:"+getX()+" y:"+getY());
	}
	String getName() {
		return this.name;
	}
	void setName(String name) {
		this.name=name;
	}
}
