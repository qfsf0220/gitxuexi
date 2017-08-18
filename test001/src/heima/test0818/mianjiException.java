package heima.test0818;

import KFjava.test20170519.Shape_test;

import javax.xml.stream.util.StreamReaderDelegate;

/**
 * Created by Administrator on 2017/8/18.
 */

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

public class mianjiException {
    public static void main(String []a){

        //try{
            Rec r = new Rec(5,-6);
            r.getArea();
        //}catch(NovalueException e){
        //    e.printStackTrace();
        //}
        System.out.println("end.");
    }
}
