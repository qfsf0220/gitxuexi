package yibai.ThreadTest;

import java.util.concurrent.CountDownLatch;

public class ThreadTest0002 {
    public static void main(String[] args) {
//        demo1();//如何让两个线程依次执行？
//        System.out.println("---");
//        demo2();//如果我们希望 B 在 A 全部打印 完后再开始打印呢？
//        demo3();//希望 A 在打印完 1 后，再让 B 打印 1, 2, 3，最后再回到 A 继续打印 2, 3。这种需求下，显然 Thread.join() 已经不能满足了。我们需要更细粒度的锁来控制执行顺序。
        demo4();
    }

    static void demo1() {
        Thread A = new Thread(new Runnable() {
            @Override
            public void run() {
                print123();
            }
        });
        Thread B = new Thread(new Runnable() {
            @Override
            public void run() {
                print123();
            }
        });
        A.start();
        B.start();
    }
    static void demo2(){
        Thread A = new Thread(new Runnable() {
            @Override
            public void run() {
                print123();
            }
        });
        Thread B = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println( "B 开始等待 A");
                try {
                    A.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                print123();
            }
        });
     A.start();
     B.start();
    }

    static void demo3(){
        Object lock = new Object();
        Thread A = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Info：A 等待锁");
                synchronized (lock){
                    System.out.println("A得到了锁lock");
                    System.out.println(Thread.currentThread().getName()+" 1");
                    try {
                        System.out.println("A进入等待 放弃lock的控制权");
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("有人 调用notify ,A唤醒，A重获lock");
                    System.out.println(Thread.currentThread().getName()+" 2");
                    System.out.println(Thread.currentThread().getName()+" 3");
                }
            }
        });
        Thread B = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Info：B等待锁");
                //synchronized用法是: synchronized(this){/区块/}，它的作用域是当前对象。
                //每个类实例对应一把锁，每个 synchronized 方法都必须获得调用该方法的类实例的锁方能执行，否则所属线程阻塞，方法一旦执行，就独占该锁，直到从该方法返回时才将锁释放，此后被阻塞的线程方能获得该锁，重新进入可执行状态。这种机制确保了同一时刻对于每一个类实例，其所有声明为 synchronized 的成员函数中至多只有一个处于可执行状态（因为至多只有一个能够获得该类实例对应的锁），从而有效避免了类成员变量的访问冲突（只要所有可能访问类成员变量的方法均被声明为 synchronized）。
                synchronized (lock){
                    System.out.println("B得到了锁lock");
                    System.out.println(Thread.currentThread().getName()+" 1");
                    System.out.println(Thread.currentThread().getName()+" 2");
                    System.out.println(Thread.currentThread().getName()+" 3");
                    System.out.println("B打印完成，调用 notify方法，唤醒wait状态的A。");
                    lock.notify();
                }
            }
        });
        A.start();
        B.start();
    }

    private static  void demo4(){
        int worker = 3;
        //countDownLatch 类似于一个倒计数器 初始化一个计数器new CountDownLatch(int x);
        //countDownLatch.await() 方法 等待线程调用 直到计数器变成0；
        //countDownLatch.countDown 方法 讲计数值减1
        //当 其他线程 的 countDown() 方法把计数值变成 0 时，countDownLatch.await()退出，继续执行下面的代码。
        //CountDownLatch 适用于一个线程去等待多个线程的情况。
        CountDownLatch countDownLatch = new CountDownLatch(worker);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("d 等待a,b,c");
                    countDownLatch.await();
                    System.out.println("All Done,d starting");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("D finished.");
            }
        }).start();
       for (char threadName='A';threadName <='C';threadName++){
           final String tn = String.valueOf(threadName);
           new Thread(new Runnable() {
               @Override
               public void run() {
                   System.out.println(tn+" is working");
                   try {
                       Thread.sleep(100);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println(tn+" finished.");
                   countDownLatch.countDown();
               }
           }).start();
       }


    }



    static void print123() {
        int i = 0;
        while (i++ < 3) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}