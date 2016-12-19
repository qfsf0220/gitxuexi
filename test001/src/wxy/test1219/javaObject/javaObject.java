package wxy.test1219.javaObject;

/**
 * Object 类位于 java.lang 包中，是所有 Java 类的祖先，Java 中的每个类都由它扩展而来。
 *
 * @author feng.qian
 * @create at 2016-12-19 13:30
 */


public class javaObject extends Object{
    //定义Java类时如果没有显示的指明父类，那么就默认继承了 Object 类
    //public class javaObject 是简写形式
    //完整写法就是public class javaObject extends Object
    public static void main(String[] args) {
        System.out.println("this is a test ");

        //Object 类中的 equals() 方法用来检测一个对象是否等价于另外一个对象，语法为：
        //public boolean equals(Object obj)


        //散列码(hashCode)是按照一定的算法由对象得到的一个数值，散列码没有规律。如果 x 和 y 是不同的对象，x.hashCode() 与 y.hashCode() 基本上不会相同。


        //toString() 方法是 Object 类中定义的另一个重要方法，是对象的字符串表现形式，语法为：
        //public String toString()
        //返回值是 String 类型，用于描述当前对象的有关信息。Object 类中实现的 toString() 方法是返回当前对象的类型和内存地址信息，但在一些子类（如 String、Date 等）中进行了 重写，也可以根据需要在用户自定义类型中重写 toString() 方法，以返回更适用的信息。

    }
}
