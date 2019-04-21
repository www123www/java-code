package t3;
import java.util.Scanner;
 class ma {
public static void main(String args[])
{
	

	jk com[]={
			new Computer("100","台式电脑"),
			new Computer("100","笔记本电脑"),new Phone("100","台式ip"),new Computer("100","笔记本电脑"),new Computer("100","笔记本电脑")};
	
	
		Shangdian sd=new Shangdian(com);
		Scanner sc = new Scanner(System.in); 
		System.out.println("请输入姓名："); 
		String name = sc.nextLine(); 
		String ppp; 
       	Shangdian result =(Shangdian) sd.serchName(name);
       	
      for(int i=0;i<result.size;i++) 
      {
    	  if (result.sd[i]!=null)
    	  {	ppp= result.sd[i].getName()+ result.sd[i].getPrice();
    	System.out.println(ppp);}
    	  else {
    		  break;
    	  }
     
      } 

}
}
