package wxy.sumscop20170811;

/**
 * Created by Administrator on 2017/8/11.
 */
//接口必须通过类来实现(implements)它的抽象方法，然后再实例化类。类实现接口的关键字为implements。
// 如果一个类不能实现该接口的所有抽象方法，那么这个类必须被定义为抽象方法。
 //   不允许创建接口的实例，但允许定义接口类型的引用变量，该变量指向了实现接口的类的实例。
  //          一个类只能继承一个父类，但却可以实现多个接口。
public class UseInterfaceTest {
    public  static void main(String[]a){
        statHdd sh1 = new samsung();//初始化三星硬盘
        statHdd sh2 = new seagate();//初始化希捷硬盘
        //这里sh1变量指向了 实现接口的类的实例 samsung 和 seagate
    }
}
interface statHdd{
    public static final int  CONNECT_NUM = 5;
    public void write(String data);
    public String read();
}

interface fixHdd{
    String address = "pudong";
    boolean hasFix();
}
class seagate implements statHdd,fixHdd{
    public String read(){
        return "read data in seagate disk.";
    }
    public void write(String data){
        System.out.println("write ok");
    }
    public boolean hasFix(){
        return true;
    }
}

class samsung implements  statHdd{
    public String read(){
        return "read data in samsung disk.";
    }
    public void write(String data){
        System.out.println("write ok.");
    }
}

abstract class xxx implements statHdd{  //注意这里面必须加上 abstract
    //如果一个类不能实现该接口的所有抽象方法，那么这个类必须被定义为抽象方法。
    public String read(){
        return "read data in broken disk";
    }
}