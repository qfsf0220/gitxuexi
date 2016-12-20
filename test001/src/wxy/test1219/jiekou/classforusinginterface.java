package wxy.test1219.jiekou;

/**
 * 接口作为引用类型来使用，任何实现该接口的类的实例都可以存储在该接口类型的变量中，通过这些变量可以访问类中所实现的接口中的方法，Java 运行时系统会动态地确定应该使用哪个类中的方法，实际上是调用相应的实现类的方法。
 *
 * @author feng.qian
 * @create at 2016-12-20 16:10
 *
 * 把接口作为方法的参数和返回类型。
 */


public class classforusinginterface {

    public void test1(A a) {
        a.dosth();
    }

    public static void main(String[] args) {
        classforusinginterface cfui = new classforusinginterface();
        A a = new B();
        cfui.test1(a);
    }
}
    interface A{
        public  int dosth();
    }

    class B implements A{
        public int dosth(){
            System.out.println("now in b");
            return 123;
        }
    }
//haven't understand..
