package wxy.test1211;

/**
 在Java中，同一个类中的多个方法可以有相同的名字，只要它们的参数列表不同就可以，这被称为方法重载(method overloading)。
 参数列表又叫参数签名，包括参数的类型、参数的个数和参数的顺序，只要有一个不同就叫做参数列表不同。
 重载就是在一个类中，有相同的函数名称，但形参不同的函数。重载的结果，可以让一个程序段尽量减少代码和方法的种类。

 参数列表不同包括：个数不同、类型不同和顺序不同。
 仅仅参数变量名称不同是不可以的。
 跟成员方法一样，构造方法也可以重载。
 声明为final的方法不能被重载。
 声明为static的方法不能被重载，但是能够被再次声明。

 方法的重载的规则：

 方法名称必须相同。
 参数列表必须不同（个数不同、或类型不同、参数排列顺序不同等）。
 方法的返回类型可以相同也可以不相同。
 仅仅返回类型不同不足以成为方法的重载。
 */

class cztest{
    int aaa(int a){
        return a;
    };
    String aaa(String a){
        return a;
    }
    void aaa(double a){
        System.out.println("1参数  没有返回值 不过参数列表不同 ，符合语法ok");
    }
}
public class chongzai {
    public static void main(String[] args) {
        cztest c= new cztest();
        int x = c.aaa(111);
        System.out.println(x);
        c.aaa(5.55);
    }
}
