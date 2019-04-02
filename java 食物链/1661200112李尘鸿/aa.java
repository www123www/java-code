package cdt;

 class  Animal {
	 
	 int x,y;
	 
 }
 
 class Lion extends Animal{
	 public Lion() {
		 x=0;
		 y=0;
		// TODO Auto-generated constructor stub
	}
	 Lion yd(Lion li){
		int a=(int)(Math.random()*4);
		int b=(int)(Math.random()*4);
		li.x=li.x+a;
		li.y=li.y+b;
		 return li ;
	 }
	 void sx(Lion li){
		 System.out.println("("+li.x+","+li.y+")");
	 }
 }
	
 class Wolf extends Animal{
	 public Wolf() {
		 x=0;
		 y=0;
		// TODO Auto-generated constructor stub
	}
	 Wolf yd(Wolf wo){
		int a=(int)(Math.random()*4);
		int b=(int)(Math.random()*4);
		wo.x=wo.x+a;
		wo.y=wo.y+b;
		 return wo ;
	 }
	 void sx(Wolf wo){
		 System.out.println("("+wo.x+","+wo.y+")");
	 }
 }

 class Rabbit extends Animal{
	 public Rabbit() {
		 x=0;
		 y=0;
		// TODO Auto-generated constructor stub
	}
	 Rabbit yd(Rabbit ra){
		int a=(int)(Math.random()*4);
		int b=(int)(Math.random()*4);
		ra.x=ra.x+a;
		ra.y=ra.y+b;
		 return ra ;
	 }
	 void sx(Rabbit ra){
		 System.out.println("("+ra.x+","+ra.y+")");
	 }
 }
	
 public class aa{
	 public static void main(String args[]){
		 Lion li=new Lion();
		 Wolf wo=new Wolf();
		 Rabbit ra=new Rabbit();
		 System.out.println("Lion狮子:");
		 li.yd(li);
		 li.sx(li);
		 System.out.println("Lion狮子移动后:");
		 li.yd(li);
		 li.sx(li);
		 System.out.println("Wolf狼:");
		 wo.yd(wo);
		 wo.sx(wo);
		 System.out.println("Wolf狼移动后:");
		 wo.yd(wo);
		 wo.sx(wo);
		 System.out.println("Rabbit兔子:");
		 ra.yd(ra);
		 ra.sx(ra);
		 System.out.println("Rabbit兔子移动后:");
		 ra.yd(ra);
		 ra.sx(ra);
	 }
 }