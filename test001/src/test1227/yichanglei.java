package test1227;

/**
 * Created by qf on 2016/12/27.
 */
public class yichanglei {
    public static void main(String [] args){
        int a=10;
        int b= 0;

        aa aaa = new aa();
        aaa =null;
        try{
            int c = a/b;
            aaa.bb();
        }catch (NullPointerException e){ //这里的异常子类都是系统提供的，也可以使用Exception这个类 是异常的父类，同样可以捕捉异常。
            System.out.println("这个是空指针错误");
        }catch (ArithmeticException e ){
            System.out.println("这个是算数运算错误");
        }
    }
}

class   aa{
    void bb(){}
}