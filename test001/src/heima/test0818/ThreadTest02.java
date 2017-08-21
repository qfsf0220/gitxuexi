package heima.test0818;

/**
 * Created by Administrator on 2017/8/18.
 */
public class ThreadTest02 {
    public static void main(String []a){
        ThreadDemo t1 = new ThreadDemo("i am Thread1");
        ThreadDemo t2 = new ThreadDemo("i am Thread2");
        t1.start();
        t2.start();

        for (int i=0;i<=50;i++){
            System.out.println("main "+i);
        }

    }
}

class ThreadDemo extends Thread{
    private  String a;
    ThreadDemo(String a){
        this.a = a;
    }
    public  void run(){
        for(int i=0;i<=50;i++){
            System.out.println(a +"..t.." +i);
        }
    }
}