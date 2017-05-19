package KFjava.test20170519;

import com.sun.xml.internal.stream.StaxErrorReporter;
import sun.security.provider.SHA;

/**
 * Created by Administrator on 2017/5/19.
 */
public abstract class Shape_test {
    {System.out.println("执行shape初始化块");}
    private String color;
    public abstract double  calPerimeter();//定义一个计算周长的抽象方法
    public abstract String getType();//定义一个返回形状的抽象方法
    //注意 这里抽象方法是根本没有方法体的 即{}
    //public String gettype(){};这个是一个普通方法，方法体为空。
    //这里定义shape的构造器，这个构造器不是为了穿件shape对象，而是为了被子类调用。
    public Shape_test(){};
    public  Shape_test(String color){
        System.out.println("执行shape的构造器");
        this.color=color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public static void main(String args[]){
        System.out.println("抽象类必须使用abstract修饰符来修饰，抽象方法必须使用absstract修饰，抽象方法不能有方法体" +
                "\n抽象类不能被实例化，无法使用new调用，即使抽象类中不包含抽象方法" +
                "\n抽象类可以包含成员变量，方法（普通方法或抽象方法），构造器，初始化块，内部类（借口，枚举），注意 抽象类的构造器不能用于穿件实例，主要是用于子类的调用"+
        "\n含有抽象方法的类，只能被定义成抽象类。"+"\n\n总结就是 抽象类 得到了   可以包含抽象方法的能力， 失去了 创建实例的能力");
    }
}
