package wxy.test1219.chouxianglei;

/**
 * 在自上而下的继承层次结构中，位于上层的类更具有通用性，甚至可能更加抽象。从某种角度看，祖先类更加通用，它只包含一些最基本的成员，人们只将它作为派生其他类的基类，而不会用来创建对象。甚至，你可以只给出方法的定义而不实现，由子类根据具体需求来具体实现。
 *
 * @author feng.qian
 * @create at 2016-12-19 16:51
 *
 * 这种只给出方法定义而不具体实现的方法被称为抽象方法，抽象方法是没有方法体的，在代码的表达上就是没有“{}”。包含一个或多个抽象方法的类也必须被声明为抽象类。

使用 abstract 修饰符来表示抽象方法和抽象类。

抽象类除了包含抽象方法外，还可以包含具体的变量和具体的方法。类即使不包含抽象方法，也可以被声明为抽象类，防止被实例化。


抽象类不能被实例化，抽象方法必须在子类中被实现。
 */


public class abstractTest {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("qf");
        t.work();

        Farmer d = new Farmer();
        d.setName("sf");
        d.work();
    }
}


//定义一个抽象类
abstract class People{
    private  String name;//实例变量

    //共有的setX 和 getX 方法

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    //抽象方法
    public abstract void work();
    //这里的  work 抽象方法不要 同样是一个正常实现的类。

}

class  Teacher extends People{
    //必须实现该方法
    public void work(){
        System.out.println("i am a teacher .my name is "+this.getName());
    }
}


class  Farmer extends People{
    //必须实现该方法
    public void work(){
        System.out.println("i am farmer .my name is "+this.getName());
    }
}
/*
* 关于抽象类的几点说明：
抽象类不能直接使用，必须用子类去实现抽象类，然后使用其子类的实例。然而可以创建一个变量，其类型是一个抽象类，并让它指向具体子类的一个实例，也就是可以使用抽象类来充当形参，实际实现类作为实参，也就是多态的应用。
不能有抽象构造方法或抽象静态方法。


在下列情况下，一个类将成为抽象类：
当一个类的一个或多个方法是抽象方法时；
当类是一个抽象类的子类，并且不能为任何抽象方法提供任何实现细节或方法主体时；
当一个类实现一个接口，并且不能为任何抽象方法提供实现细节或方法主体时；注意：
这里说的是这些情况下一个类将成为抽象类，没有说抽象类一定会有这些情况。
一个典型的错误：抽象类一定包含抽象方法。 但是反过来说“包含抽象方法的类一定是抽象类”就是正确的。
事实上，抽象类可以是一个完全正常实现的类
*
* */
