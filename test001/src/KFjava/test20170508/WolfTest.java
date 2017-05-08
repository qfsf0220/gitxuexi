package KFjava.test20170508;

import sun.java2d.opengl.WGLSurfaceData;

/**
 * Created by Administrator on 2017/5/8.
 */
class one{
    public one(){
        System.out.println("无参数构造器");
    }
}
class two extends one{
    public two(String name ){
        System.out.println("一个String参数构造器  name"+ name);
    }
    public two(String name,int age){
        this(name); //这个this调用同一个重载的构造器。
        System.out.println("两个参数构造器  age"+age);
    }
}

public class WolfTest  extends two{
    public WolfTest(){
        super("wolf",12);//显式调用父类有两个参数的构造器
        System.out.println("wolf 无参数构造器");
    }
    public  static void main(String []args){
        WolfTest wt = new WolfTest();
        System.out.println("==========");
        one o = new one();
    }
}
