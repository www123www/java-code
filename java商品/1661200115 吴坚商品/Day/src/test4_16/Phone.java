package test4_16;

//ÊÖ»úÀà
class Phone implements ShopInterface{
	String name;
	public Phone(String name) {
		this.name = name;
	}
	@Override
	public String getName(){
		return name;
	}
}
