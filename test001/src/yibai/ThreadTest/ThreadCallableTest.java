package yibai.ThreadTest;

import java.util.InputMismatchException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by Administrator on 2017/10/16.
 */
public class ThreadCallableTest {
    public static void main(String[] args) {
        Callabletest();
    }

    static void Callabletest() {
        Callable<Integer> ccc = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int result = 0;
                for (int i = 0; i <= 5; i++) {
                    result += i;
                    System.out.println(result);
                }
                System.out.println("all:"+result);
                return Integer.valueOf(result);
            }
        };
        FutureTask<Integer> fff = new FutureTask<Integer>(ccc);
        new Thread(fff).start();
        try {
            System.out.println( "result:" + fff.get());
            String rrr ="" ;
            for(int i =0;i<3;i++){
                rrr+=fff.get();
            }
            System.out.println(rrr);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
