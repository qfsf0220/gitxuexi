package heima.test0818;

/**
 * Created by qfsf on 2017/8/19.
 */
public class TicketDemo {
    public static void main(String[] args) {
        Ticket t1 = new Ticket();//三个售票窗口
        Ticket t2 = new Ticket();
        Ticket t3 = new Ticket();
        t1.start();
        t2.start();
        t3.start();
    }
}

class Ticket extends Thread{
    private static int tick = 100;
    public  void run(){
        while(true){
            if(tick>0) {
                System.out.println(this.currentThread().getName()+" sale:"+ tick--);
            }
            else{
                break;
            }
        }
    }
}
