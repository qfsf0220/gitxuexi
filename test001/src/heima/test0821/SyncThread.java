package heima.test0821;

import heima.test0818.ThreadTest02;

/**
 * Created by Administrator on 2017/8/21.
 * 如果碰到 共享数据上一个线程没用完  另一线程使用。会造成重复使用。这个时候需要
 * 同步模块
  synchronized(任意对象){
        需要被同步的代码
 }

 */
public class SyncThread {
    public static void main(String[] args) {
        TicketDemo3 t3 = new TicketDemo3();
        Thread t4= new Thread(t3);
        Thread t5= new Thread(t3);
        Thread t6= new Thread(t3);
        Thread t7= new Thread(t3);
        t4.start();
        t5.start();
        t6.start();
        t7.start();
    }
}

class TicketDemo3 implements Runnable{
    private int  o = 100;
    Object obj = new Object();
    public void run(){
        while (true){//需要放在synchronized中的代码 为使用到共享数据的代码 这里就是有变量o的代码
            synchronized (obj) { //这里形参放入任意 实例对象 可以用原始类 Object
                if (o > 0) {  //这里用到了int o 从这里
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "  sale  " + o--);//这里用到了int o  到这里 都放在sync中。
                } else {
                    break;
                }
            }
        }
    }
    private int sum;
    public synchronized void add(int n) throws InterruptedException {//synchronized 可以代用到方法上作为关键字
        sum =sum+n;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("sum="+sum);
    }
}

