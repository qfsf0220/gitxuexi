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





    private String name = "qq"; //实例变量
    private  static double price =800; //类变量
    public  static void main(String []args){
        int price =  999;//局部变量
        System.out.println(price);
        System.out.println(VariableOverrideTest.price);
        new VariableOverrideTest().info();
    }
    void info(){
        String name = "ff";
        System.out.println(name);
        System.out.println(this.name);
    }
}
