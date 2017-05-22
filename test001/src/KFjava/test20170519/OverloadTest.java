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
        Overriding or =new Overriding(1111);
        or.aaa("1");
    }
}
class Overriding extends OverloadTest{
    public Overriding(int a) {
        super(a);
    }
    public void aaa(String a){
        System.out.println("重写了aaa()，注意：重写需要方法名，参数列表相同"+"\n否则不是重写，并且子类全校要比父类宽松，值类型挤异常类型要低等");
        super.aaa();
    }
}