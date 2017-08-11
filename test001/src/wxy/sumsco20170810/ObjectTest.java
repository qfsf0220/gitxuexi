package wxy.sumsco20170810;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by Administrator on 2017/8/11.
 */
public class ObjectTest {
    public static void main(String[]a){
        Abc obj = new Abc();

        boolean  ba = obj.equals(new Abc());
        new Abc().printff();
        System.out.println(ba);
    }
}
class Abc extends Object{
    void printff(){
        System.out.println("this Abc function.");
    }

}//这个是完整写法。

