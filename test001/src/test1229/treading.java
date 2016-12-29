package test1229;

import sun.java2d.loops.GraphicsPrimitive;

import javax.swing.plaf.basic.BasicTreeUI;

/**
 * 当Java程序启动时，一个线程立刻运行，该线程通常叫做程序的主线程（main thread），因为它是程序开始时就执行的。
 *
 * @author feng.qian
 * @create at 2016-12-27 10:18
 */


public class treading {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t);
        t.setName("my thread");
        System.out.println(t);
        try{
            for(int n =5 ;n>0;n--){
                System.out.println(n);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }

    }
}
