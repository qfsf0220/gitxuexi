package heima.test0818;

import KFjava.test20170519.Shape_test;

import javax.xml.stream.util.StreamReaderDelegate;

class NovalueException extends RuntimeException{
    NovalueException(String msg){
        super(msg);
    }
}

interface  Shape{
    void getArea();
}

class Rec implements Shape{
    private int len,wid;
    Rec(int len ,int wid)//throws NovalueException
    {
        if (len<=0||wid<=0) {
            throw new NovalueException("这个值小于等于0，是错误的。");
        }
        this.len = len;
        this.wid= wid;
    }

    public void getArea() {
        System.out.println(len*wid);
    }
}

class Circle implements Shape{
    private int r;
    public static final double PI = 3.1416; // static 这个数据为共享数据 子类的话这个都能用到。public让其他类都能读到 final 不修改。
    Circle(int r){
        if (r<=0){
            throw new NovalueException("弄好啊，小于0的数值，不对。");
        }
        this.r =r;
    }
    public void getArea() {
        System.out.println(PI*r*r);
    }
}

public class mianjiException {
    public static void main(String []a){

        //try{
            Rec r = new Rec(5,6);
            r.getArea();
        //}catch(NovalueException e){
        //    e.printStackTrace();
        //}
            Circle c = new Circle(6);
            c.getArea();

        System.out.println("end.");
    }
}
