/**
 * 内部类可以访问外部类的所有成员，反过来不行。内部类的成员
 *只有在内部类的作用域内才是一直的，并且外部类不能使用。
 * @author feng.qian
 * @create at 2016-12-02 10:59
 */
class outer1202{

    int outx=99;
    void test(){
//        inner in = new inner();
//        inner.display();
    }
    static void test2(){
        System.out.println("1111");
    }



class inner {
    int y = 100; //y is inner local.


    void display() {   //display()方法也是内部的无法调用
        System.out.println("outx:" + outx);
    }
}
//    void showy(){
//        System.out.println("y:"+y);//y是内部类的实例变量 y无法调用，showy这个内部类outer也用不了。
//    }
}

public class innerclasstest1202 {
    public static void main(String[] args) {
        outer out = new outer();
        out.test();
    }
}
