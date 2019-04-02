package fs;

public class zhu {
	public static void main(String args[])
	{
		
		Lion l=new Lion(1, 1);
		Rabbit r=new Rabbit(1,2);
		Wolf w=new Wolf(1,3);
		for(int i=0;i<10;i++){

			if(l!=null)
			{
				
				 System.out.println("狮子的坐标");
				 l.zb();
				 l.display();
				
				
				}
		
		if(w!=null)
		{
			
			 System.out.println("狼的坐标");
			 w.zb();
			 w.display();
			
			
			}
		if(r!=null)
		{
			
			 System.out.println("兔子的坐标");
			 r.zb();
			 r.display();
			
			
			}
		if(r!=null&&w!=null&&r!=null){
			if(l.x==w.x&&l.y==w.y&&l.x==r.x&&l.y==r.y){
				 System.out.println("狮子吃掉狼和兔子");
				 System.out.println("狮子的坐标");
				 l.zb();
				 l.display();
				 w=null;
				 r=null;
				 break;
			}
			
		}
		if(l!=null&&w!=null){
			if(l.x==w.x&&l.y==w.y){
				System.out.println("狮子吃掉狼");
				w=null;
				if(r!=null){
					System.out.println("狮子的坐标");
					 l.zb();
					 l.display();
					 System.out.println("兔子的坐标");
					 r.zb();
					 r.display();
				}
			}
		}
		if(l!=null&&r!=null){
			if(l.x==r.x&&l.y==r.y){
				System.out.println("狮子吃掉兔子");
				r=null;
				if(w!=null){
					System.out.println("狮子的坐标");
					 l.zb();
					 l.display();
					 System.out.println("狼的坐标");
					 w.zb();
					 w.display();
				}
			}
		}
		if(w!=null&&r!=null){
			if(w.x==r.x&&w.y==r.y){
				System.out.println("狼吃掉兔子");
				r=null;
				if(l!=null){
					System.out.println("狮子的坐标");
					 l.zb();
					 l.display();
					 System.out.println("狼的坐标");
					 w.zb();
					 w.display();
				}
			}
		}
			}

		
		}
		}
