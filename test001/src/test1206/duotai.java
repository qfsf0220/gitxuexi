package test1206;

/**
 * 这个是一个多态test
 * 多态性的体现:方法的重写和重载
 *              对象的多态性
 *                         向上转型：程序会自动完成
 *                              父类  父类对象 = 子类实例
 *                         向下转型
                                子类 子类对象 = （子类）父类实例

 * @author feng.qian
 * @create at 2016-12-06 10:08
 */
class A{
    public  void a1(){
            System.out.println("A---a1");
    }
    public void a2(){
        System.out.println("A---a2");
    }
}

class  B extends  A{
    public void a1(){
        System.out.println("B---a1");
    }
    public  void a3(){
        System.out.println("B---a3");
    }
}


public class duotai {
    public static void main(String[] args) {
//向上转型
        B b = new B();
        A a = b;
        a.a1();  //这个a1 已经被B子类重写 所以出现的是 B---a1
        a.a2();


        System.out.println("------------------");
//向下转型
        A ax = new A();
        B bx = (B)ax;  //括号中要指定子类 后面是父类的实例对象  ax
        bx.a1();
        bx.a2();
        bx.a3();


    }
}
