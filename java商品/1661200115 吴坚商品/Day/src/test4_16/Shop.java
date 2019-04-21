package test4_16;
//…Ã∆∑¿‡
class Shop {
	ShopInterface s[];
	Shop(ShopInterface s[]){
		this.s = s ;
	}
	void keyword_query(String name){
		for(ShopInterface ss:s){
			if(ss.getName().contains(name)==true){
				System.out.println(ss.getName());
			}
		}
	}
}
