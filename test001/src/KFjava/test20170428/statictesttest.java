package KFjava.test20170428;

/**
 * Created by Administrator on 2017/5/2.
 */

class aaa{
    static void aa(){
        System.out.println("a");
    }
}

class bbb{
    void bb(){
        System.out.println("b");
    }
}

public class statictesttest {
    public static void main(String[]args){
        aaa.aa(); //static 无需本类的对象调用就可以调用此方法
        //声明为static的方法  只能访问static数据 只能访问static数据 只能访问static数据。
        bbb object_b =new bbb(); //这里需要先定义ob
        object_b.bb();


    }
}
