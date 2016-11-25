
class guessgame {
    player p1;
    player p2; //
    player p3;

    public void startGame(){
        p1=new player();
        p2=new player();
        p3=new player();

        int guessp1=0;
        int guessp2=0;
        int guessp3=0;

        boolean p1isright = false;
        boolean p2isright = false;
        boolean p3isright = false;

        int targetnum = (int) (Math.random()*10);
        System.out.println("enter a num 0-9");

        while (true) {
            System.out.println("num is "+ targetnum);
            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 =p1.number;
            System.out.println("the num:"+guessp1);
            guessp2 =p2.number;
            System.out.println("the num:"+guessp2);
            guessp3 =p3.number;
            System.out.println("the num:"+guessp3);

            if (guessp1==targetnum){
                p1isright=true;
            }
            if (guessp2==targetnum){
                p2isright=true;
            }
            if (guessp3==targetnum){
                p3isright=true;
            }


            if (p1isright||p2isright||p3isright){
                System.out.println("we have winner !");
                System.out.println("player1"+p1isright);
                System.out.println("player2"+p2isright);
                System.out.println("player3"+p3isright);
                System.out.println("game stop");
                break;
            }
            else{
                System.out.println("try again");
            }


        }

    }

}

 class player{
    int number=0;

    public void guess(){
        number = (int)(Math.random()*10);
        System.out.println("guess -->"+number );
    }
}

public class headguessgame{
    public static void main (String [] args){
        guessgame game =new guessgame();
        game.startGame();
    }
}



