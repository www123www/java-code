public class Animal {
    int x,y;//坐标

    //移动 d：方向
    void move(int d){
        switch (d){
            case 1:
                if (x>0) {
                    x -= 1;
                }else {
                    System.out.println("超过边界");
                }
                break;
            case 2:
                if (x < 4) {
                    x += 1;
                } else {
                    System.out.println("超过边界");
                }
                break;
            case 3:
                if (y > 0) {
                    y -= 1;
                } else {
                    System.out.println("超过边界");
                }
                break;
            case 4:
                if (y < 5) {
                    y += 1;
                } else {
                    System.out.println("超过边界");
                }
                break;
        }
    }
    //被吃，设置为负数，不出现在地图
    void die(){

        x=-1;
        y=-1;
    }
}
class Lion extends Animal{//狮子
    Lion(){
        x=1;
        y=1;
    }
}
class Wolf extends Animal{//狼
    Wolf(){
        x=1;
        y=2;
    }
}
class  Rabbit extends Animal{//兔子
    Rabbit(){
        x=2;
        y=2;
    }
}