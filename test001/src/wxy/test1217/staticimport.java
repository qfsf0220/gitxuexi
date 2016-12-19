package wxy.test1217;

/**
 * @author feng.qian
 * @create at 2016-12-19 10:25
 *
 * 静态导入是 Java 5 的新增特性，用来导入类的静态变量和静态方法。
 *
 * 一般我们导入类都这样写：
 * import packageName.className;  // 导入某个特定的类
或
import packageName.*;  // 导入包中的所有类

而静态导入可以这样写：
import static packageName.className.methonName;  // 导入某个特定的静态方法
或
import static packageName.className.*;  // 导入类中的所有静态成员

导入后，可以在当前类中直接用方法名调用静态方法，不必再用 className.methodName 来访问。

对于使用频繁的静态变量和静态方法，可以将其静态导入。静态导入的好处是可以简化一些操作，例如输出语句 System.out.println(); 中的 out 就是 System 类的静态变量，可以通过 import static java.lang.System.*; 将其导入，下次直接调用 out.println() 就可以了。
 */

import static java.lang.System.*;
import static java.lang.Math.random;



public class staticimport {
    public static void main(String[] args) {
        out.println("打印一个随机数"+random());
    }
}
