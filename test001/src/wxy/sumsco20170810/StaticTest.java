package wxy.sumsco20170810;

/**
静态变量和静态方法的总结：
   ● 一个类的静态方法只能访问静态变量；
   ● 一个类的静态方法不能够直接调用非静态方法；
   ● 如访问控制权限允许，静态变量和静态方法也可以通过对象来访问，但是不被推荐；
   ● 静态方法中不存在当前对象，因而不能使用 this，当然也不能使用 super；
   ● 静态方法不能被非静态方法覆盖；
   ● 构造方法不允许声明为 static 的；
   ● 局部变量不能使用static修饰。

 */
public class StaticTest {
    static int i;
    int j ;

    public StaticTest(){
        this.j=40;
    }
    static int sum(int x,int y){ //静态方法
        return  x+y;
    }
    //静态初始器，静态块
    static{
        i= 9999;
        System.out.println("this is a  static block.");
    }
    public  void test(){
        System.out.println( "i:"+i);
    }


   public static void main(String[]a){
       System.out.printf("类变量 %d\n",StaticTest.i);

       StaticTest st = new StaticTest();
       System.out.printf("实例变量 %d\n",st.j);

       System.out.println("类方法： sum ");
       System.out.println(sum(5,555));

       //静态块
       System.out.println("i:"+i);
       new StaticTest().test();//匿名调用方法

   }
}
