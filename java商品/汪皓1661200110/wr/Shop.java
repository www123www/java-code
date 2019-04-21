package src.wr;

public class Shop {
	SP[] sp=new SP[3];
	int num=0;
	public void JR(SP sp){
		if(num<3){
			this.sp[num]=sp;
			num++;
			
		}
		else{
			 System.out.println("ÒÑÂú");
		}
	
		
	}
	public void jl(String name){
		for(int i=0;i<sp.length;i++)
		{
			if(sp[i].getname().contains(name)){
			
				 System.out.print(sp[i].getname()+","+sp[i].getprice());
			}
		}
	}
	
}
