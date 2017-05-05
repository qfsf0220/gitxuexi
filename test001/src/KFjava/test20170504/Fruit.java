package KFjava.test20170504;

/**
 * Created by Administrator on 2017/5/5.
 */
 class Apple {
    public double weight;
    public void info(){
        System.out.println("this is a fruit "+weight+" kg");
    }
}

public  class Fruit extends Apple{
    public static void main(String []args){
        Apple a = new Apple();
        a.weight=5;
        a.info();
    }

        }