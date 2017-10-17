package yibai.ThreadTest;

import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by Administrator on 2017/10/16.
 */
public class ThreadCallable002 {
    public static void main(String[] args) {
        bbb();

    }

    static void aaa() {
        FutureTask<String> ff = new FutureTask<String>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                String result="";
                for (int i =0;i<=100;i++){
                    result=result+""+i;
                }
                return  result;
            }
        });
        new Thread(ff).start();
        String result;
        try {
            result = ff.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    static void bbb() {
        ExecutorService threadPoolExe = Executors.newCachedThreadPool();
        Future<Integer> fff = threadPoolExe.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(Thread.currentThread().getName());

                }
                return new Random().nextInt(100);
            }

        });
        threadPoolExe.shutdown();//如果不再需要新任务，请适当关闭threadPoolExecutor并拒绝新任务
        try

        {
            for(int i = 1;i<=5;i++)
            System.out.println(fff.get());
        } catch (
                InterruptedException e)

        {
            e.printStackTrace();
        } catch (
                ExecutionException e)

        {
            e.printStackTrace();
        }
    }

}


