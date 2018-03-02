package test180227;

/**
 * Created by Administrator on 2018/3/2.
 */
public class OopTest {
    static int num3 =4;
    int printnum3(){
        return num3;
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