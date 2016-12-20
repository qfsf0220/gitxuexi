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
        System.out.printf(" 抽象类A有两个子类B、C，由于A中有方法method2的实现，\n子类B、C中不需要重写method2方法，我们就说A为子类提供了公共的功能，\n或A约束了子类的行为。method2就是代码可重用的例子。\nA 并没有定义 method1的实现，也就是说B、C 可以根据自己的特点实现method1方法，这又体现了松散耦合的特性。 ");
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

    /**
     * @author feng.qian
     * @create at 2016-12-20 17:06
     */


    public static class demo2 {
        public static void main(String[] args) {

        }
    }
}
