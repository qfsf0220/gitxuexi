package test1220.demo1;

/**
 * @author feng.qian
 * @create at 2016-12-20 17:40
 */


public class demo2 {
    public static void main(String[] args) {
        System.out.printf(" 接口A无法为实现类B、C提供公共的功能，也就是说A无法约束B、C的行为。\nB、C可以自由地发挥自己的特点现实 method1和 method2方法，接口A毫无掌控能力。  ");
    }

    public interface A{
        public void method1();
        public void method2();

    }

    public class B implements A{
        public void method1(){
            System.out.println("b -- method1");
        }
        public void method2(){
            System.out.println("b -- method2");
        }
    }

    public class C implements A{
        public void method1(){
            System.out.println("c-- method1");
        }
        public void method2(){
            System.out.println("c -- method2");
        }
    }
}
