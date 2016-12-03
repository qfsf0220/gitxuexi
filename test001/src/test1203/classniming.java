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

public class classniming {
    public static void main(String[] args) {
        niming p = new niming();  //这里直接调用niming类中的方法。
    }
}
