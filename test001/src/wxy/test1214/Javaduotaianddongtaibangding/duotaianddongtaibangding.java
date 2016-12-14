package wxy.test1214.Javaduotaianddongtaibangding;

/**
 * 在Java中，父类的变量可以引用父类的实例，也可以引用子类的实例。
 *
 * @author feng.qian
 * @create at 2016-12-14 11:26
 */

class Animal{
    public void say(){
        System.out.println("this is animal");
    }
}

class Cat extends  Animal{
    public void say(){
        System.out.println("this is a cat ");
    }
}

class Dog extends Animal{
    public void say(){
        System.out.println("this is a dog");
    }
}


public class duotaianddongtaibangding {
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.say();

        obj = new Cat();
        obj.say();

        obj= new Dog();
        obj.say();
//obj 变量的类型为 Animal，它既可以指向 Animal 类的实例，也可以指向 Cat 和 Dog 类的实例，这是正确的。也就是说，父类的变量可以引用父类的实例，也可以引用子类的实例。注意反过来是错误的，因为所有的猫都是动物，但不是所有的动物都是猫。


        //obj 既可以是人类，也可以是猫、狗，它有不同的表现形式，这就被称为多态。

        //多态存在的三个必要条件：要有继承、要有重写、父类变量引用子类对象。

        /*当使用多态方式调用方法时：
        首先检查父类中是否有该方法，如果没有，则编译错误；如果有，则检查子类是否覆盖了该方法。
        如果子类覆盖了该方法，就调用子类的方法，否则调用父类方法。*/
    }
}
