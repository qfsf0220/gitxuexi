package KFjava.test20170424;

/**
 * Created by Administrator on 2017/4/24.
 */
public class LogicCalc {
    public static  void main (String args []){
        int a = 5;
        int b = 10;
        int c = 10;
        int e= 10;
        int f= 10;
        if (a>2 |b++ >10){ //  |这个是非短路或操作 a>2做完 还会继续操作b++ 虽然b++操作对结果没有影响
            System.out.println("A:"+a + " B:"+b);
        }
        if (a>2 || c++ >10){// ||这个是短路操作。如果第一个为true了 结果就已经是true了 所以跳过c++ 直接执行下面操作
            System.out.println("A:"+a + " C:"+c);
        }
        if (a>2 & ++e>10){ // 非短路操作 ++i是先加 再赋值 i++是先赋值再加
            System.out.println("A:"+a + " E:"+e);
        }
        if (a>2 && ++f>10){ //短路操作
            System.out.println("A:"+a + " F:"+f);
        }
    }
}
