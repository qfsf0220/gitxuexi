package wxy.test1210;

/**
 类级变量在类定义后就已经存在，占用内存空间，可以通过类名来访问，不需要实例化。

 对象实例级变量就是成员变量，实例化后才会分配内存空间，才能访问。

 方法级变量就是在方法内部定义的变量，就是局部变量。

 块级变量就是定义在一个块内部的变量，变量的生存周期就是这个块，出了这个块就消失了，比如 if、for 语句的块。块是指由大括号包围的代码

 方法内部除了能访问方法级的变量，还可以访问类级和实例级的变量。
 块内部能够访问类级、实例级变量，如果块被包含在方法内部，它还可以访问方法级的变量。
 方法级和块级的变量必须被显示地初始化，否则不能访问。
 */
public class zuoyongyu {
    public static void main(String[] args) {
        int age =30;
        String name ="laozong";
        System.out.println(name+","+"你已经"+age+"岁了。");
    }
}
