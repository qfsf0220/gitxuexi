package wxy.test1219.javafinal;

/**
 * Java final关键字：阻止继承和多态
 *
 * @author feng.qian
 * @create at 2016-12-19 10:41

在 Java 中，声明类、变量和方法时，可使用关键字 final 来修饰。final 所修饰的数据具有“终态”的特征，表示“最终的”意思。具体规定如下：
final 修饰的类不能被继承。
final 修饰的方法不能被子类重写。
final 修饰的变量（成员变量或局部变量）即成为常量，只能赋值一次。
final 修饰的成员变量必须在声明的同时赋值，如果在声明的时候没有赋值，那么只有 一次赋值的机会，而且只能在构造方法中显式赋值，然后才能使用。
final 修饰的局部变量可以只声明不赋值，然后再进行一次性的赋值。

 */

public final class finaltest{
    public static int TOTAL_NUMBER = 5;
    public int id;
    public finaltest() {
        // 非法，对final变量TOTAL_NUMBER进行二次赋值了
        // 因为++TOTAL_NUMBER相当于 TOTAL_NUMBER=TOTAL_NUMBER+1
        id = ++TOTAL_NUMBER;
    }
    public static void main(String[] args) {
//        final Demo t = new Demo();
        final int i = 10;
        final int j;
        j = 20;
        //j = 30;  // 非法，对final变量进行二次赋值
    }
}
