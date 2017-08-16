package heima.test0816;

import wxy.test1212_usebaozhuanglei.StringToInt;

/**
 * Created by Administrator on 2017/8/16.
 */
public class TryCatchFinally {
    public static void main(String[]args){
        Demo816 d = new Demo816();
        try{
            int x = d.div(4,0);
            System.out.println("x:"+x);
        }catch(Exception e ){
            System.out.println("零除错误。");
            System.out.println("-----");
            System.out.println(e.getMessage());//输出异常信息  ：/ by zero
            System.out.println(e.toString());//输出异常信息  ：异常名称 和 /by zero
            e.printStackTrace();//会把所有信息打印出来。（名称，信息，位置）
        }
        System.out.println("这里需要打印。");
    }
}

class Demo816{
    int div(int a,int b){
        return  a/b;
    }
}