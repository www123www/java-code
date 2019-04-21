package Test8_2;

public class Phone implements Message
{
	String name;
	int Price;
	public Phone(String name,int Price) 
	{
		this.name=name;
		this.Price=Price;
	}
	@Override
	public String GetName() {
		return name;
	}
	public int GetPrice() {
		return Price;
	}
}
