package test1203;

/**
 * Created by qfsf on 2016/12/3.
 */
class niming{
//    构造方法
    public niming(){  //注意构造方法是不要 添加返回值类型的。而且类名与方法名必须一样。
        System.out.println("Hello");
    }

    int age ;
    String name ;
    public niming(int age ,String name){  //这个是方法的重载 构造方法也可以使用构造方法。
        this.age=age;
        this.name=name;
        System.out.println("a:"+age+" b:"+name);
    }

}

class test{
    public void printtt(){
        System.out.println("hello test");
    }
}

public class classniming {
    public static void main(String[] args) {
        niming p = new niming();  //这里直接调用niming类中的方法。

        test t = new test();//这个是普通调用

        new test().printtt();//这个是匿名调用 省略了栈内存创建t  好处就是用一次就回收掉了。
        //如果还要使用一次 需要重新new一次。反而可能比较麻烦
        new test().printtt();
    }
}
