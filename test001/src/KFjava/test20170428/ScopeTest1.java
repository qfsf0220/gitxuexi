package KFjava.test20170428;

import javax.sound.midi.Soundbank;

/**
 * Created by Administrator on 2017/5/3.
 */
public class ScopeTest1 {
    int a ;
    public void test1(){
        int a;
        for (a=0;a<3;a++){
            System.out.println(a);
        }
    }
    public void test2(){
        for (int a=0;a<3;a++){
            System.out.println(a);
        }
    }
    public  void test3(){
        ScopeTest1 st = new ScopeTest1();
        for (st.a=0;st.a<3;st.a++){
            System.out.println(st.a);
        }
    }

    public static void main(String []args){
        ScopeTest1 st=new ScopeTest1();
        st.test1();
        System.out.println("---------");
        st.test2();
        System.out.println("---------");
        st.test3();

    }
//三个方法结果相同 ，但是一般保证 这个变量的作用域只在这个代码块内。

}

