package Test8_2;

public class Computer implements Message
{
	String name;
	int Price;
	public Computer(String name,int Price) 
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
