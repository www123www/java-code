package move;
class Animal {
	int x,y;
	Animal()
	{
		x=0;
		y=0;
	}
	void Display(){System.out.println("("+x+","+y+")");}
	void Display1(Animal l){}
}


class Lion extends Animal{
	int lion=3;
	Lion() {
		x=0;
		y=0;
	}
	Lion moveDistance(Lion l)
	{
		int a= (int)(Math.random()*2);
		int b= (int)(Math.random()*2);
		l.x=l.x + a;
		l.y=l.y + b;
		return l;
	}
	void Display1(Lion l)
	{

		System.out.println("lion:"+"("+l.x+","+l.y+")");
	}
}


class Wolf extends Animal {
	int wolf=2;
	Wolf() {
		x=0;
		y=0;
	}
	Wolf moveDistance(Wolf l)
	{
		int a= (int)(Math.random()*2);
		int b= (int)(Math.random()*2);
		l.x=l.x + a;
		l.y=l.y + b;
		return l;
	}
	void Display1(Wolf l)
	{

		System.out.println("wolf:"+"("+l.x+","+l.y+")");
	}
}


class Rabbit  extends Animal {
	int rabbit=1;
	Rabbit() {
		x=0;
		y=0;
	}
	Rabbit moveDistance(Rabbit l)
	{
		int a= (int)(Math.random()*2);
		int b= (int)(Math.random()*2);
		l.x=l.x + a;
		l.y=l.y + b;
		return l;
	}
	void Display1(Rabbit l)
	{

		System.out.println("rabbit:"+"("+l.x+","+l.y+")");
	}
}
public class shiwulian {
	public static void main(String args[])
	{
		Lion l1=new Lion();
		Rabbit l2=new Rabbit();
		Wolf  l3=new Wolf();

		for(int i=0;i<5;i++)
		{
				
		System.out.print("lion:");
				l1.Display();
				l1.moveDistance(l1);
				System.out.print("lion移动后:");
				l1.Display1(l1);
		
			
		if (l2!=null)
			{
				System.out.print("rabbit:");
				l2.Display();	
				System.out.print("rabbit移动后:");
				l2.moveDistance(l2);
				l2.Display1(l2);
	}
		if (l3!=null)
		{
				System.out.print("wolf:");
				l3.Display();
				l3.moveDistance(l3);
				System.out.print("wolf移动后:");
				l3.Display1(l3);
			    
		}
				
			if (l1!=null&&l2!=null&&l3!=null)
			{
				if (l1.x==l3.x && l1.y==l3.y && l1.x==l2.x&&l1.y==l2.y)
				{
					System.out.print("lion吃掉rabbit和wolf:");
					System.out.println("剩下：");
					l1.Display1(l1);
					l3=null;
					l2=null;
					break;
				}
				
			}
			if (l1!=null&&l2!=null)
			{
				if (l1.x==l2.x && l1.y==l2.y)
				{
					System.out.print("lion吃掉rabbit:");
					
					l2=null;
					System.out.println("剩下：");
					if (l3!=null)
					l3.Display1(l3);
					l1.Display1(l1);
				}

			}
			if (l1!=null&&l3!=null)
			{
				if (l1.x==l3.x && l1.y==l3.y)
				{
					System.out.print("lion吃掉wolf:");
					
					l3=null;
					System.out.println("剩下：");
					if (l2!=null)
					l2.Display1(l2);
					l1.Display1(l1);
				}

			}

			if (l2!=null&&l3!=null)
			{			
				if (l2.x==l3.x && l2.y==l3.y)
				{
					System.out.print("wolf吃掉rabbit:");
					l2=null;
					System.out.println("剩下：");
					if (l1!=null)
					l1.Display1(l1);
					l3.Display1(l3);
				}
			}

		}

	}
}
