package wxy.test1215;

/**
 * Java static关键字以及Java静态变量和静态方法
 *
 * @author feng.qian
 * @create at 2016-12-15 14:40
 *
 * static 修饰符能够与变量、方法一起使用，表示是“静态”的。
静态变量和静态方法能够通过类名来访问，不需要创建一个类的对象来访问该类的静态成员，所以static修饰的成员又称作类变量和类方法。静态变量与实例变量不同，实例变量总是通过对象来访问，因为它们的值在对象和对象之间有所不同。
 */



public class usestatic {
    static  int a = 10;
    int b ;

    usestatic(){
        this.b = 20;
    }

//    public int getB() {
//        return b=2;
//    }

    public static void main(String[] args) {
        System.out.println(usestatic.a);
        usestatic u = new usestatic();
//        System.out.println(u.getB());
        System.out.println(u.b);

    }
}
