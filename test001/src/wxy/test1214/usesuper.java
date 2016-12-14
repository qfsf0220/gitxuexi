package wxy.test1214;

import javax.swing.*;

/**super 关键字的功能：
 * 调用父类中声明为 private 的变量。
 *
 * 点取已经覆盖了的方法。
 *
 *作为方法名表示父类构造方法。
 *
 * 通过 super 调用父类的隐藏变量，必须要在父类中声明 getter 方法，因为声明为 private 的数据成员对子类是不可见的。
 *
 * 值得注意的是：
 在构造方法中调用另一个构造方法，调用动作必须置于最起始的位置。
 不能在构造方法以外的任何方法内调用构造方法。
 在一个构造方法内只能调用一个构造方法。
 *
 * 如果编写一个构造方法，既没有调用 super() 也没有调用 this()，编译器会自动插入一个调用到父类构造方法中，而且不带参数。

 最后注意 super 与 this 的区别：super 不是一个对象的引用，不能将 super 赋值给另一个对象变量，它只是一个指示编译器调用父类方法的特殊关键字。
 *
 * @author feng.qian
 * @create at 2016-12-14 10:04
 */

class Animal{
    private String desc = " this is animals ";

    public String getDesc(){//必须要声明一个getXxx方法
        return desc;
    }

    public void move(){
        System.out.println("animal can move");
    }
}

class Dog extends Animal{
    public void move(){//
        super.move();//这里电泳 Animal类中的move。输出 "animal can move"
        System.out.println("dog can walk and run.");
        //通过getXxx 方法调用父类的隐藏变量
        System.out.println("And we know"+ super.getDesc());
    }
}

public class usesuper {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.move();
    }
}
