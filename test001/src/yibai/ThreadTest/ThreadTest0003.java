package yibai.ThreadTest;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by Administrator on 2017/10/13.
 */
public class ThreadTest0003 {
    public static void main(String[] args) {
        demo5();
    }
    static void demo5() {
        int runner = 3;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(runner);
        //创建cyclicBarrrier 对象  这只同时等待线程数  new CyclicBarrier(3); 三个
        //当命令行全部完成 就调用 cyclicBarrier.await() 等待其他线程。
        //当全部线程调用 await()方法。才继续执行下面语句。
        final Random random = new Random();
        for (char runnerName = 'A'; runnerName <= 'C'; runnerName++) {
            final String rn = String.valueOf(runnerName);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    long prepareTime = random.nextInt(10000) ;
                    System.out.println(rn + "准备时间是 " + prepareTime);//随机一个等待时间
                    try {
                        Thread.sleep(prepareTime);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(rn + "准备ok,waiting for others.");
                    try {
                        cyclicBarrier.await();//当前线程完成 等他其他线程
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                    System.out.println("全部完成。 " + rn + " starting. ");
                }
            }).start();
        }
    }


}
