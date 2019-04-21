package Test8_2;

public class Shop 
{
	//static int MAXSIZE=5;
	Message[] message=new Message[2];
	int num=0;
	Shop()
	{
	}
	public void TJ(Message message)
	{
		if(num<2)
		{
			this.message[num]=message;
			num++;
		}
		else 
		{
			System.out.println("商店已满");
		}
	}
	public void GetVolume(String name) 
	{
		int temp=0;
		for (int i = 0; i <message.length ; i++) 
		{
			if(message[i].GetName().contains(name))
			{
				System.out.print(message[i].GetName()+"  "+message[i].GetPrice());
				temp=0;
			}
			else
			{
				//System.out.println("没有该商品");
			}
		}
	}
}
