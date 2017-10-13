package yibai.ThreadTest;

import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by Administrator on 2017/10/13.
 */
public class ThreadTest0003 {
    public static void main(String[] args) {
//        demo5();//针对 线程 A B C 各自开始准备，直到三者都准备完毕，然后再同时运行 。
        demo6(); //让子线程去计算从 1 加到 100，并把算出的结果返回到主线程。
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

//我们经常要创建子线程来做一些耗时任务，然后把任务执行结果回传给主线程使用，这种情况在 Java 里要如何实现呢？
    //由于 Runnable的run 方法并不返回结果  所以需要使用到 接口类 Callable
    static void demo6(){ //demo6，让子线程去计算从 1 加到 100，并把算出的结果返回到主线程。
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("start---");
                Thread.sleep(1000);
                int result = 0;
                for (int i =0;i <=100;i++){
                    result +=i;
                }
                System.out.println("finished. return result");
                return result;
            }
        };
        FutureTask<Integer> futureTask = new FutureTask<Integer>(callable);
        new Thread(futureTask).start();

        try {
            System.out.println("before futureTask.get()");
            System.out.println("result: "+ futureTask.get());
            System.out.println("after futureTask.get()");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }


}
