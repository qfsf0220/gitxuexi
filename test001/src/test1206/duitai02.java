package test1206;

/**
 * 对象多态性的运用
 *
 * @author feng.qian
 * @create at 2016-12-06 16:02
 */

class  A1{
    public void nihao1(){
        System.out.println("a1  nihao1");
    }
}
class B1 extends A1{
    public void nihao2(){
        System.out.println("b1 nihao2");
    }
}
class C1 extends A1{
    public void nihao3(){
        System.out.println("c1 nihao3 ");
    }
}
class D1 extends  A1{
    public void nihao4(){
        System.out.println("d1 nihao4");
    }
}
class E1 extends A1{
    public void nihao5(){
        System.out.println("e1 nihao5");
    }
}

public class duitai02 {
    public static void main(String[] args) {
        say(new B1());
        say(new D1());
        say(new E1());//这里是强制都要输出a1 nihao1下面的say是调用
        //a的nihao1方法
    }

    public static void say(A1 a){
        a.nihao1();
    }
//    public static void say(C1 c){
//        c.nihao1();
//    }
//    public  static void say(E1 e){
//        e.nihao1();
//    }
}
