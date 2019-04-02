package fs;

public class Animal {
	double x,y;
	Animal(double x1,double y1){
		x=x1;
		y=y1;
	}
 void zb()
 {
	 int a=(int)(Math.random()*3);
	 int b=(int)(Math.random()*3);
	
	 x=a+x;
	 y=b+y;
 }

 void display()
 {
	
	 System.out.println(x+","+y);
 }
 
 }
