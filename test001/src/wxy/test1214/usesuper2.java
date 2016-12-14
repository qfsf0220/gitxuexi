package wxy.test1214;

/**
 * 演示  调用父类的构造方法
 *
 * @author feng.qian
 * @create at 2016-12-14 10:15

 *
 */

class Animal2{
    String name;
    public Animal2(String name){
        this.name= name;
    }
}

class Dog2 extends Animal2{
    int age;
    public Dog2(String name,int age){
        super(name);  //注意 super 继承父类的构造方法必须放在第一行
        this.age=age;

    }

    public void say(){
        System.out.println("this is"+name+"it is "+age);
    }

}

public class usesuper2 {
    public static void main(String[] args) {
        Dog2 d = new Dog2("shasha",5);
        d.say();
    }
}
/*
*  * 值得注意的是：
在构造方法中调用另一个构造方法，调用动作必须置于最起始的位置。
不能在构造方法以外的任何方法内调用构造方法。
在一个构造方法内只能调用一个构造方法。

如果编写一个构造方法，既没有调用 super() 也没有调用 this()，编译器会自动插入一个调用到父类构造方法中，而且不带参数。

最后注意 super 与 this 的区别：super 不是一个对象的引用，不能将 super 赋值给另一个对象变量，它只是一个指示编译器调用父类方法的特殊关键字。
* */

