package test4_16;

//µçÄÔÀà
class Computer implements ShopInterface{
	String name;
	public Computer(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		
		return name;
	}

}
