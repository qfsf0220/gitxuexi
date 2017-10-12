package yibai.ThreadTest;

import sun.awt.TracedEventQueue;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by Administrator on 2017/10/12.
 */
public class ThreadTest0001 {
    public static void main(String[] args) {
//        for(int i=0;i<100;i++){
//            System.out.println(Thread.currentThread().getName()+" "+i);
//            if(i == 20){
//                new FisrstThread().start();
//                new FisrstThread().start();
//            }
//        }
        SecondThread st = new SecondThread();
        //通过 new thread(target ,name )方法穿件新线程。
        new Thread(st,"111").start();
        new Thread(st,"222").start();
        new Thread(st,"333").start();
    }
}

class FisrstThread extends Thread{
    private int i;
    //重写run()方法，run方法是线程执行体
    public void run(){
        for (;i<50;i++){
            //当线程继承Thread类时，直接使用this可以获取当前线程。
            //thread对象的getName()方法返回线程的,名字
            System.out.println(getName()+"  "+i);
        }
    }
}


class SecondThread implements Runnable{
    private int i ;
    //重写run()方法，run方法是线程执行体
    public void run(){
        for (;i<100;i++){
            //当线程类实现runnable接口时，只能用thread.currentThread()方法
            System.out.println(Thread.currentThread().getName()+" :"+i)  ;
        }
    }
}

class ThirdThread {
    public static void main(String[] args) {
        ThirdThread rt = new ThirdThread();
        FutureTask<Integer> task = new FutureTask<Integer>((Callable < Integer >) () ->{
            int i = 0;
            for (;i<100;i++){
                System.out.println(Thread.currentThread().getName()+"  "+i);
            }
            return i;
        });
    }
}