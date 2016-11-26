/**
 * Created by qfsf on 2016/11/26.
 *
 *！！！
 * 变量什么时候定义为成员变量：
 * 如果这个变量是用来面熟这个类的信息的。那么这个变量就应该定义为成员变量。
 *
 * 变量的范围越小越好，这样能及时被回收。
 */

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
class   demo1126{
    public int sum(){
        int a = 10;
        int b = 20;
        int c = a+b;
        return c;

    }
}

public class classdemo1 {
    public static void main (String[]args){
        //方式1
        demo1126 d =new demo1126();
        System.out.println(d.sum());
    }
}
 这个测试版本不好，因为参与操作的数据现在是固定的。

 **/
//方式2
//class demo1126{
//    public int sum(int a,int b){
//        return a+b;
//    }
//}
//
//
//public class classdemo1 {
//    public static void main (String[]args){
//        demo1126 d = new demo1126();
//        System.out.println(d.sum(10,50));
//    }
//}  方式2 有所改进  现在方法3 把 a，b定义为成员变量测试
class demo1126{
    int a;
    int b;
    public  int sum() {
        return a + b;
    }
}


public class classdemo1 {
    public static void main (String[]args){
        //方法3
        demo1126 d = new demo1126();
        d.a=40;
        d.b=50;

        System.out.println(d.sum());
    }
}
//虽然方法3可以，也复合了面向对象的思想。但是不好。
//应为：类是一组相关的属性和行为的集合。并且类是通过事物转换过来的。
//而类中的成员变量就是事物的属性，属相是用来描述事物的。
//成员变量是用来描述类的。
//
