package KFjava.test20170428;

/**
 * Created by Administrator on 2017/5/2.
 */
public class BlockTest {
    public static void main(String[]args){
        //这里局部变量实在在方法里定义的变量
        int a; //局部变量a
//        System.out.println("a 的 值 是："+a); //这里的a 没有赋值 既初始化
        a=5;
        System.out.println("a 的 值 是："+a);

    }
//    System.out.println("a 的 值 是："+a); //这里的a 并不存在 超过作用域
}
