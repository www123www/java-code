public class Eat {
    Animal animal[]={new Lion(),new Wolf(),new Rabbit()};//狮子 狼 兔子


    void compare(){
        if (animal[0].x==animal[1].x&&animal[0].y==animal[1].y){//如果狮子与狼坐标相同则狼被吃
            animal[1].die();
            System.out.println("<--狼被吃掉了-->");
        }
        if (animal[0].x==animal[2].x&&animal[0].y==animal[2].y){//如果狮子与兔子坐标相同则兔子被吃
            animal[2].die();
            System.out.println("<--兔子被吃掉了-->");

        }
        if (animal[1].x==animal[2].x&&animal[1].y==animal[2].y){//如果狼与兔子坐标相同则兔子被吃
            animal[2].die();
            System.out.println("<--兔子被吃掉了-->");

        }
    }

    //输出地图
    void show(){
        compare();
        System.out.println("L表示狮子，W表示狼，R表示兔子..."+"开始移动吧！");

        for (int i = 0; i <4; i++) {
            for (int j = 0; j < 5; j++) {
                if (animal[0].x==i&&animal[0].y==j){//如果当前坐标点i,j与狮子坐标相同，输出L代表狮子
                    System.out.print("L");
                }else if (animal[0].x==i&&animal[1].y==j){
                    System.out.print("W");
                }else if (animal[2].x==i&&animal[2].y==j){
                    System.out.print("R");
                }else {
                    System.out.print(".");//一个点表示一个位置
                }
            }
            System.out.println();
        }
    }

    //选择移动的动物 a：动物 d：方向
    void choice(int a, int d){
        if (a==1){
            animal[0].move(d);
        }
        if (a==2){
            animal[1].move(d);
        }
        if (a == 3) {
            animal[2].move(d);
        }
    }
}
