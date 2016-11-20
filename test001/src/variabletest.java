import sun.rmi.server.Activation$ActivationSystemImpl_Stub;

/**
 * Created by qfsf on 2016/11/20.
 * 成员变量 和  局部变量的区别
 *  在类中位置不同
 *      成员变量  在类中 方法外
 *      局部变量  在方法定义中  或 方法声明上
 *  在内存中的位置不同
 *   成员变量 堆内存
 *   局部变量 栈内存
 *
 *   范围不同
 *   成员变量 对象消失 消失
 *   局部变量 方法调用完毕 消失
 *
 *   初始化值不同
 *   成员变量  堆内存 有默认值  (null  0  0.0  /u0000 false ..)
     局部变量  没有初始值 必须定义 赋值 然后调用
 *
 *    注意
 *    成员变量 和 局部变量  明明相同的话
 *    就近原则
 */

class Variable{
    int num ; //成员变量



    public void show(){
        //int num2;  //这个是局部变量  像这样没有初始化值的话 是无法通过编译的。

        //int num = 200000; //局部变量  这个num 和成员变量重名，那就就近原则 如果打开 num就是200000 注释就是找
        //上面的 成员变量num 就是 0
        System.out.println(num);
        int num2 = 10;
        System.out.println(num2);
    }
}

public class variabletest {
    public static void main(String[] args) {
        Variable myv = new Variable();
        System.out.println(myv.num); //这个是成员变量 所以有默认 int值 0

        myv.show();

    }



}
