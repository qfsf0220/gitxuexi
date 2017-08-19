package heima.test0818;

import sun.awt.windows.ThemeReader;

/**
 * Created by qfsf on 2017/8/19.
 使用 runnable 接口实现
 */
public class TicketDemo2 {
    public static void main(String[] args) {
        Ticket2 t2 = new Ticket2(); //这个是runnable接口的实例 并不是线程Thread的实例
        Thread td1= new Thread(t2);//Thread 方法可以识别 runnable对象 这里就是t2
        Thread td2= new Thread(t2);
        Thread td3= new Thread(t2);
        td1.start();
        td2.start();
        td3.start();
    }
}

class Ticket2 implements Runnable{
    private  int a= 100;
    public void run(){

        while(true){
            if(a>0){
                System.out.println(Thread.currentThread().getName()+" Sale:" +a--);
            }else{
                break;
            }
        }
    }
}
