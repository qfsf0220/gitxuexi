package yibai.ThreadTest;

/**
 * Created by Administrator on 2017/10/12.
 */
public class ThreadTest002 {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo("1111");
        t1.start();
        ThreadDemo t2 = new ThreadDemo("2222");
        t2.start();
    }
}

class ThreadDemo extends Thread{
    private Thread t;
    private String threadName;
    ThreadDemo(String threadName){
        this.threadName=threadName;
        System.out.println("Create： "+threadName);
    }
    public void run(){
        System.out.println("start running:" + threadName);
        for(int i =888;i>0;i--){
            System.out.println(threadName+"   "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("shoudong zhongduan");
            }
            System.out.println(threadName+"over.");
        }
        System.out.println(threadName+"over.");
    }

    public void start(){
        System.out.println("Starting:" +threadName);
        if(t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }

}
