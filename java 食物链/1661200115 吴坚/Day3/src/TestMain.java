
public class TestMain {

     public static void main(String[] args) {
    	 
    	 int count=0;//
       	 int l_x=(int) (1+Math.random()*10),l_y=(int) (1+Math.random()*10);//狮子横纵坐标
     	int r_x=(int) (1+Math.random()*10),r_y=(int) (1+Math.random()*10);//兔子横纵坐标
     	int w_x=(int) (1+Math.random()*10),w_y=(int) (1+Math.random()*10);//狼横纵坐标
   	  	Lion lion=new Lion();

 
	   	 Rabbit rabbit=new Rabbit();		 
		 Wolf wolf=new Wolf(); 
		 TestMain test=new TestMain();
		 
		 lion.setName("狮子");
		 wolf.setName("狼");
		 rabbit.setName("兔子");
		 
		 while(count!=2) {

			 lion.move(l_x,l_y);
			 rabbit.move(r_x, r_y);
			 wolf.move(w_x, w_y);	

			 //先狼先吃了兔子，
			 if(test.is_eat(wolf,rabbit)&&!rabbit.getName().equals(" ")) {
				 
				 rabbit.pritln();
				 wolf.pritln();
				 System.out.println("狼吃了兔子");
				
				 rabbit.setName(" ");
				 count++;
				 
			 }
			 else if(test.is_eat(lion,wolf)&&!wolf.getName().equals(" ")) {
				 lion.pritln();

				 wolf.pritln();
				 System.out.println("狮子吃了狼");
				
				 wolf.setName(" ");
				 count++;
			 }
			 else if(test.is_eat(lion, rabbit)&&!rabbit.getName().equals(" ")) {
				 lion.pritln();
				 rabbit.pritln();

				 System.out.println("狮子吃了兔子");
				
				 rabbit.setName(" ");
				 count++;
			 }else {
				 //坐标更新
				 l_x=(int) (1+Math.random()*10);
				l_y=(int) (1+Math.random()*10);
				 w_x=(int) (1+Math.random()*10);
				w_y=(int) (1+Math.random()*10);
				 r_x=(int) (1+Math.random()*10);
				r_y=(int) (1+Math.random()*10);
			 }
			 
			 if(rabbit.getName()==" "&&wolf.getName()==" ")break;
		 }
		

		 
		 
		 
	}
    boolean is_eat(Animal a,Animal b) {
    	if(a.getX()==b.getX()&&a.getY()==b.getY()) {

    		return true;
    	}
    	
    	
    	
    	return false;
    }
}
