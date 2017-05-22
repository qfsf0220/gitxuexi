package KFjava.test20170519;

import KFjava.test20170428.OverloadVarargs;

/**
 * Created by Administrator on 2017/5/22.
 */
public class OverloadTest {
    int a=9;
    String abc;
    public void aaa(String abc){System.out.println("单个字符参数test（）");}
    public void aaa(String...abc) {System.out.println("可变参数test（）");}
    public OverloadTest(int a){
        this.a=a;
        System.out.println("int:" +a);
    }
    public OverloadTest(String abc){
        this.abc=abc;
        System.out.println("String:"+abc);
    }
    public static void main(String []args){
        OverloadTest ot = new OverloadTest("55");
        ot.aaa("aa","bb","cc");
    }
}
