package test1220.demo1;

/**
 * @author feng.qian
 * @create at 2016-12-20 16:59
 * 区别1
 * 1) 抽象类可以为部分方法提供实现，避免了在子类中重复实现这些方法，提高了代码的可重用性，这是抽象类的优势；而接口中只能包含抽象方法，不能包含任何实现。
 *
 */


public class demo1 {
    public static void main(String[] args) {
        System.out.println(" 抽象类可以为部分方法提供实现，避免了在子类中重复实现这些方法，提高了代码的可重用性，这是抽象类的优势；而接口中只能包含抽象方法，不能包含任何实现。  ");
    }

    public abstract class A{
        public  abstract void method1();
        public void method2(){
            System.out.println("class A method 2");
        };
    }
    public class B extends A{
        public void method1(){
            System.out.println("class B  -- method1");
        }
    }
    public class C extends A{
        public void method1(){
            System.out.println("class c -- method1");
        }
    }

}
