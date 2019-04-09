package test;
public class Main {

    public static void main(String[] args) {

        System.out.println("----------Start----------");

        Lion lion = new Lion("狮子");
        Wolf wolf = new Wolf("只狼");
        Rabbit rabbit = new Rabbit("兔子");

        System.out.println("----------行动----------");

        while (true)
        {
            if(lion.life == true)
            {
                lion.Move();
                lion.Judge(wolf,rabbit);
            }
            if(wolf.life == true)
            {
                wolf.Move();
                wolf.Judge(lion,rabbit);
            }
            if(rabbit.life == true)
            {
                rabbit.Move();
                rabbit.Judge(lion,wolf);
            }
            if(wolf.life == false && rabbit.life == false)
            {
                System.out.println("END");
                break;
            }
        }
    }
}
  

