package test;

public class Animal {
    final int length = 3,width = 3;
    int x;
    int y;
    int rank;
    boolean life;
    String name;

    public Animal()
    {
        x = 0;
        y = 0;
        rank = 0;
        life = true;
    }

    public void setBirthplace()
    {
        int minlen = 0;
        int minwid = 0;
        int maxlen = length;
        int maxwid = width;
        this.x = (int) (Math.random()*(maxwid - minwid + 1) + minwid);
        this.y = (int) (Math.random()*(maxlen - minlen + 1) + minlen);
        outCoord();
    }

    public void Move()
    {
        System.out.println(name+"开始移动");
        setBirthplace();
    }

    public void outCoord()
    {
        System.out.println(name+"的位置:"+"X轴为:"+this.x+" Y轴为:"+this.y);
    }

    public void Judge(Animal a,Animal b)
    {
        if(a.life == true)
        {
            if(this.x == a.x && this.y == a.y)
            {
                if(this.rank < a.rank)
                {
                    System.out.println(this.name+"吃掉了"+a.name);
                    a.life = false;
                }
                else
                {
                    System.out.println(this.name+"被吃掉了");
                    this.life = false;
                }
            }
        }
        if(b.life == true)
        {
            if(this.x == b.x && this.y == b.y)
            {
                if(this.rank < b.rank)
                {
                    System.out.println(this.name+"吃掉了"+b.name);
                    b.life = false;
                }
                else
                {
                    System.out.println(this.name+"被吃掉了");
                    this.life = false;
                }
            }
        }
    }
}
  
