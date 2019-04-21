package t3;

public class Shangdian{
	

	int size=0;
	int maxsize=3;	
	jk[] sd=new jk[maxsize];
	
	Shangdian(jk[] j)
	{
		while(true) 
		{
			if (size!=maxsize)
		{	
			sd[size]=j[size];
			size++;
		}
		else 
		{
			System.out.println("man");
			break;
		}
			}

	}
	
	Shangdian  serchName(String name) 
	{
		jk[] temp=new jk[maxsize];
		int tempnum=0;
		for(int i=0;i<sd.length;i++) {
			if(sd[i].getName().indexOf(name)!=-1)
			{
				
				temp[tempnum]=sd[i];
				tempnum++;
				
			}
			else 
			{
				
				
			}
			
		}
		Shangdian sd=new  Shangdian(temp);
		return sd;
	}



	


		
	

}
