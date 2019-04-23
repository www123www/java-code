package chap6;

 abstract class Goods implements Message{//二手商品类

		class phone{
			void getMessage(){
			System.out.println("手机的详细信息为...");
			}
		}
		class computer{
			void getMessage(){
				System.out.println("电脑的详细信息为...");
				}
		}
}
