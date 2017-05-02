package KFjava.test20170428;

import java.util.stream.Stream;

/**
 * Created by Administrator on 2017/5/2.
 */
public class Varargs {
    public  static void test(int a,String... books){
        for(String tmp:books){
            System.out.println(tmp);
        }
        System.out.println(a);
    }
    public static void test2(int a,String [] books){
        for(String tmp:books){
            System.out.println(tmp);
        }
    }
 //两个方法调用可变参数。
    //长度可变参数只能处于形参的列表的最后，一个方法只能包含一个长度可变形参。
    public static void main(String []args){
        test(555,"小伙子","不错的");
        test2(666,new String []{"各位老总","不错的"});
    }
}
