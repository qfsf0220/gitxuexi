package KFjava.test201705010;

import java.util.stream.Stream;

/**
 * Created by Administrator on 2017/5/11.
 */
public class FinalVariableTest {
    final int a= 6;
    final String str;
    final int c;
    final static double d;
    {str ="qqe";}
    static {d=5.6;}
    public FinalVariableTest(){
        c=5;
        //str="wwewe"; //这里如果在初始化块中已经对str指定了初始值 那在构造器中不能对final重新赋值
    }
    public void changeFinal(){
        //普通发放不能为final修饰的成员变量赋值
        //d= 1.2;
        //不能再普通方法中为final成员变量指定初始值
        // ch = 'a'
    }
    public  static void main(String args[]){
        FinalVariableTest fvt= new FinalVariableTest();
        System.out.println(fvt.a);
        System.out.println(fvt.c);
        System.out.println(fvt.d);
        System.out.println(fvt.str);
    }

}
