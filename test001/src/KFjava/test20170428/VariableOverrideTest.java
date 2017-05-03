package KFjava.test20170428;

/**
 * Created by Administrator on 2017/5/2.
 */
public class VariableOverrideTest {
    //局部变量和成员变量可以同名。如果方法里局部变量和成员变量同名。局部变量会覆盖成员变量。
    //如果方法里引用被覆盖的成员变量，可以使用this（对于实例变量）或类名（对于类变量）
    // 作为调用者来限定访问成员变量。
    /*

                          ---实例变量(没有static修饰)
                         |
           ---成员变量---|
           |            |
           |            ---类变量(以static修饰)
           |
所有变量---|
           |
           |              ---形参(方法签名中定义的变量)
           |             |
           ---局部变量---|--方法局部变量(在方法内定义)
                        |
                        ---代码块局部变量(在代码块内定义)
     */

    private    String name = "qq"; //实例变量
    private  static double price =800; //类变量
    public  static void main(String []args){
        int price =  999;//局部变量
        System.out.println(price);//局部变量覆盖成员变量。 所以打印999
        System.out.println(VariableOverrideTest.price);//使用类名限定 就是类变量

        new VariableOverrideTest().info();//运行info方法
//        VariableOverrideTest va = new VariableOverrideTest();
//        va.info();
        new VariableOverrideTest().testx();

    }
    public  void testx() {
        System.out.println(this.name);
    }

    void info(){  //info方法
        String name = "ff";//方法里的局部变量
        System.out.println(name);//直接访问 输出局部变量值
        System.out.println(this.name);//使用this限定 就是 实例变量
    }
}
