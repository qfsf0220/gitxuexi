package KFjava.test20170519;

/**
 * Created by Administrator on 2017/5/19.
 */
public class InitBlock {
    //初始化块的修饰符只能是static 或留空。
    {int a= 6;
    if(a>4){
        System.out.println("initblock初始化块，局部变量a的值大于4");
    }
        System.out.println("initblock 的初始化块");
    }
    {
        System.out.println("initblock 的 第二个初始化块");
    }

    public InitBlock(){
        System.out.println("initblock 类的无参数构造器");
    }

    public static void main(String[]args){
        new InitBlock();
    }

}
