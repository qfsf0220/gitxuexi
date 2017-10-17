package yibai.ThreadTest;

import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by Administrator on 2017/10/17.
 */
public class ThreadTest1017 {
    public static void main(String[] args) {
        test110172();
    }

    static void test11017() {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                String answer = "";
                for (int i = 0; i < 10; i++) {
                    answer += "|" + i;
                }
                return answer;
            }
        };
        FutureTask<String> futureTask = new FutureTask<String>(callable);
        new Thread(futureTask).start();

        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    static void test110172(){
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                String answer = "";
                for (int i = 0; i < 10; i++) {
                    answer += "|" + i;
                }
                return answer;
            }
        };
        FutureTask<String> futureTask = new FutureTask<String>(callable);

        int num = 3;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(num);
        for (char numname='A';numname<'D';numname++){
            String rn = String.valueOf(numname);
            new Thread(futureTask).start();
        }

        try {
            int randomtime = new Random().nextInt(1000)+500;
            System.out.println("等待" +randomtime+"ms");
            Thread.sleep(randomtime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(futureTask.isDone()) {
            try {
                System.out.println(futureTask.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }


    }
    static  void  test1017003(){
        FutureTask<Integer> futureTask = new FutureTask<Integer>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int i = 0;

            }
        });
    }

}


