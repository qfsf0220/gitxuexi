package test1220.demo1.demo3;

/**
 * @author feng.qian
 * @create at 2016-12-20 17:50
 *
 * 一个类只能继承一个直接的父类（可能是抽象类），但一个类可以实现多个接口，这个就是接口的优势。
 */


public class demo3 {
    interface A{
        public void method2();
    }
    interface B{
        public void method1();
    }

    class C implements A, B{
        public void method1(){
            System.out.println("C -- method1");
        }
        public void method2(){
            System.out.println("c -- method2");
        }
    }
    //可以如此灵活的使用C，并且C还有机会进行扩展，实现其他接口
//    C aa = new C();
//    B bb = new C();
//
//    abstract class A{
//        public abstract void method1();
//    }
//    abstract class B extends A {
//        public abstract void method2();
//    }
//    class C extends B {
//        public void method1(){
//            System.out.println("c -- method1");
//        }
//        public void method2(){
//            System.out.println("c -- method2");
//        }
//    }

    public static void main(String[] args) {

    }
}
/*
对于C类，将没有机会继承其他父类了。

综上所述，接口和抽象类各有优缺点，在接口和抽象类的选择上，必须遵守这样一个原则：
行为模型应该总是通过接口而不是抽象类定义，所以通常是优先选用接口，尽量少用抽象类。
选择抽象类的时候通常是如下情况：需要定义子类的行为，又要为子类提供通用的功能。
*/