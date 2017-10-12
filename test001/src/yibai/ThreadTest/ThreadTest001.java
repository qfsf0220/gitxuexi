package yibai.ThreadTest;

/**
 * Created by Administrator on 2017/10/12.
 */
public class ThreadTest001 {
    public static void main(String[] args) {
        RunnableDemo t1 = new RunnableDemo("T1");
        t1.start();
        RunnableDemo t2= new RunnableDemo("T2");
        t2.start();
    }
}

class RunnableDemo implements Runnable{
    private Thread t;
    private String threadName;
    RunnableDemo(String name){
    threadName =name;
    System.out.println("create:" +threadName);
}

    public void run() {
        System.out.println("Running"+threadName);
        for(int i=4;i>0;i--){
            System.out.println("thread"+threadName +" -"+i);
            try {
                t.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("thread"+threadName +" - interrupted");
            }
            System.out.println("Thread"+threadName+"over.");
        }
    }

    public void start(){
        System.out.println("starting "+threadName);
        if(t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }
}