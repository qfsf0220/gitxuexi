package KFjava.test20170428;

import wxy.test1219.innerclass.Outerclass;

/**
 * Created by Administrator on 2017/5/2.
 */
public class OverloadVarargs {
    public void test(String msg){
        System.out.println(msg);
    }
    public void test (String[] msgs){
        System.out.println("可变参数:");
        for (String tmp: msgs){
            System.out.println(tmp);
        }
    }
    public static void test(int... intmsgs){
        System.out.println("静态方法 可变参数");
        for(int tmp:intmsgs){
            System.out.println(tmp);
        }
    }

    public static void main(String[]args){
        OverloadVarargs ov = new OverloadVarargs();
        ov.test("linux");
        ov.test(new String[]{"debian","centos","ubuntu"});
        System.out.println("------");
        OverloadVarargs.test(11,22,33);
    }
}
