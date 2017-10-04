/**
 * Created by qfsf on 2017/10/5.
 */
public class AbstractTest001 {
    public static void main(String[] args) {
        car c2 = new TwoWheel();
        car c4 = new FourWheel();
        c2.start();
        c2.stop();
        c4.start();
        c4.stop();
    }
}

abstract class car{
    public abstract void start();
    public  void stop(){
        System.out.println("stop the car.");
    }
}

class TwoWheel extends  car{
    public void start(){
        System.out.println("start 2 wheel");
    }
}

class FourWheel extends  car{
    public  void start(){
        System.out.println("start 4 wheel");
    }
}