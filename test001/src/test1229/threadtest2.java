package test1229;

/**
 * @author feng.qian
 * @create at 2016-12-29 10:54
 */


public class threadtest2 {
    public static void main(String[] args) {
        Firstthread f = new Firstthread();
        f.run();
    }
}

class Firstthread extends Thread{
    private int i;
    public void  run(){
        //当线程类继承Thread类时，直接使用this可以获得当前线程。
        //Thread 对象的getName()返回当前线程的名字

        System.out.println("当前线程的名字："+getName());
    }
}