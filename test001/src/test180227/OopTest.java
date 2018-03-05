package test180227;

/**
 * Created by Administrator on 2018/3/2.
 */
public class OopTest {
    OopTest(){
        System.out.println("这个是Oooptest的无参构造方法。");
    }
    private int numx ;
    static int num3 =4;
    static int b = 1234123;
    int c = 678;
    int printnum3(){
        return num3;
    }
    public  int getNumx(){
        return numx;
    }
    public  void setNumx(int  numx){
        this.numx = numx;
        this.messagePrint();
    }

    public void messagePrint(){
        System.out.println("this is a message.");
    }

    class InnerClass{
        int numx = 5;
        void printinner(){
            System.out.println("this is a inner class"+" inner numx:"+numx+" outer numx:"+OopTest.this.numx); //内部类访问外部类的成员变量
        }
    }

    static  class staticInnerClass{
        int b = 222;
        public  void printinner2(){
            System.out.println("inner int b:"+b+"outer int b"+OopTest.b);
            System.out.println("outer c:"+ new OopTest().c);//如果 内部静态类需要访问外部非静态成员 需要 new 外部类().成员 的方式访问。
        }
    }




    public static void  main(String[] args) {

        Thisistest tt = new Thisistest();
        Thisistest tt2 = new Thisistest(5);
        Thisistest tt3 = new Thisistest(-222, 333);
        Thisistest.staticfun();
        tt3.normalfunc();
        System.out.println(Thisistest.num3);
        System.out.println(OopTest.num3);
        OopTest ot = new OopTest();
        ot.printnum3();
        ot.setNumx(123);
        System.out.println("get  numx:"+ot.getNumx());
        // 创建，调用内部类 需要通过 外部类对象 调用内部类对象。
        InnerClass ic = ot.new InnerClass();
        ic.printinner();
        //直接创建内部类的对象
        staticInnerClass staticinner = new staticInnerClass();
        staticinner.printinner2();

        funcinclassOuter fo = new funcinclassOuter();
        fo.show();

    }
}


class Thisistest{
    int num1 ;int num2;static int num3;
    public Thisistest(int a){
        System.out.println(a);
    }
    public Thisistest(){
        System.out.println("this is 无参 构造函数");
    }
    Thisistest(int b,int c){
        if (b<0){
            System.out.println("num need ge 0");
            num1 = 0;
        }else{
        num1=b;
        }
        num2 = c;
        System.out.println("num1:"+num1+"  Num2:"+num2);
    }

    void Thisistest(){
        System.out.println("这个有返回值类型 void的  就不是构造函数了。");
    }




    static void  staticfun(){
        System.out.println("this is a static function");
    }
    void normalfunc(){
        System.out.println("this is a normal function");
    }

}

class funcinclassOuter {
    void show (){
        int a = 1115;
        int b = 222;
        class funcinclassInner{
            int c = 333;
            void printt(){
                System.out.println("a:"+a + " c:"+c);
            }
        }
        funcinclassInner fi = new funcinclassInner();
        fi.printt();
    }

    public static void main(String[] args) {
        funcinclassOuter fo = new funcinclassOuter();
        fo.show();
    }
}


