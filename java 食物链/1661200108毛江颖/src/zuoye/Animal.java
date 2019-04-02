package zuoye;



public class Animal {
	int x,y;
	Animal(int x,int y){
		this.x=x;
		this.y=y;
	}


}
class Lion extends Animal {


	Lion(int x, int y) {
		super(x,y);
		x=5;y=5;

	}

}
class Wolf extends Animal {

	char a,b,c,d;
	Wolf(int x, int y) {
		super(x,y);
		x=1;y=1;

	}

}
class Rabbit extends Animal {

	
	Rabbit(int x, int y) {
		super(x,y);
		x=2;y=2;
	}

}


