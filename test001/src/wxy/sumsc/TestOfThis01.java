package wxy.sumsc;

/**
 * Created by Administrator on 2017/8/4.
 */
public class TestOfThis01 {
    public int a =1;
    public int b =2;

    public int sum(){
        int c = a+b;
        return c;
    }

    public static void main(String [] arg){
        TestOfThis01 t = new TestOfThis01();
        System.out.println( t.sum());
    }

}
class TestOfThis02 {
     int a ;
     int b ;
    public int sum(int a,int b){
        this.a = a;
        this.b = b;
        int c = a+this.b;
        return c;
    }

    public static void main(String [] arg){
        TestOfThis02 t = new TestOfThis02();
        System.out.println( t.sum(55,5));
    }

}
class TestOfThis03 {
    int a ;
    int b ;
    TestOfThis03(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println(this.a+" - "+this.b);
    }

    public static void main(String [] arg){
        TestOfThis03 t3 = new TestOfThis03(1,2);
    }

}

class TestOfThis04{
    int a;
    int b;

    public TestOfThis04(){//无参数构造方法调用下面的两个int参数的构造方法。
        this(555,888); //这里调用本类的其他构造方法，必须放在构造方法的第一句。
        System.out.println("调用了 TestOfThis04(int a,int b)");
    }
    public TestOfThis04(int a,int b){
        this.a=a;
        this.b=b;
    }


    public void printfff(){
        System.out.println(a+"  -  " +b);
    }
    public static void main(String [] a ){
        TestOfThis04 t4 = new TestOfThis04();
        t4.printfff();
    }

}

class TestOfThis05_Hard{
    public  static void main(String []a){
        B b = new B(new A());
    }
}
class A{
    public A(){
        new B(this).printbbb();
    }
    public void printaaa(){
        System.out.println("AAAA");
    }
}
class B{
    A a;
    public B(A a){
        this.a=a;
    }
    public void printbbb(){
        a.printaaa();
        System.out.println("BBBB");
    }
}


