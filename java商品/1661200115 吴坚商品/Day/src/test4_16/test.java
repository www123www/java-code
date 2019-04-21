package test4_16;

public class test {

	public static void main(String[] args) {
		ShopInterface shopdata[] =  new ShopInterface[4];
		shopdata[0] = new Phone("华为P30");
		shopdata[1] = new Phone("华为P30Pro");
		shopdata[2] = new Computer("华为笔记本电脑");
		shopdata[3] = new Computer("苹果平板电脑");
		Shop shop = new Shop(shopdata);
		String keyword = "华为";
		shop.keyword_query(keyword);
	}

}
