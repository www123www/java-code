package LJJ;

public class test {

	public static void main(String[] args) 
	{
		Animal[] A={new Lion("狮王"),new Wolf("狼王"),new Rabbit("小兔子")};
		for(int i=0;i<A.length;i++)
		{
			System.out.println(A[i].name+"开始坐标：("+A[i].x+","+A[i].y+")");
		}
		System.out.println("-----------------");
		for(int i=0;i<10;i++)//五回合
		{
			for(int j=0;j<A.length;j++)//动物移动
			{
				if(A[j]!=null)
				{
					A[j].YD();//移动
					System.out.println(A[j].name+"("+A[j].x+","+A[j].y+")");
				}
			}
			for(int k=0;k<A.length;k++)//利用冒泡排序原理，比较
			{
				for(int l=0;l<A.length;l++)
				{

					if(A[l]!=null&&A[k]!=null&&A[k].x==A[l].x&&A[k].y==A[l].y)
					{
						if(A[k].z>A[l].z)
						{
							System.out.println(A[k].name+"把"+A[l].name+"吃掉了");
							A[l]=null;
						}
					}
					if(A[l]==null&&A[k]==null)
					{
						break;
					}
				}
			}
			System.out.println("-----------------");
		}
	}
}
