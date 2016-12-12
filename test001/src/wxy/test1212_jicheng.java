package wxy;

/**
 * 继承可以理解为一个类从另一个类获取方法和属性的过程。如果类B继承于类A，那么B就拥有A的方法和属性。  继承使用 extends 关键字。
 *
 * @author feng.qian
 * @create at 2016-12-12 10:54
 *
 * name 和 age 变量虽然没有在 Teacher 中定义，但是已在 People 中定义，可以直接拿来用。
    Teacher 是 People 的子类，People 是Teacher 类的父类。
    子类可以覆盖父类的方法。
    子类可以继承父类除private以为的所有的成员。
    构造方法不能被继承。
 *
 */
class People{
    String name;
    int age;

    void say(){
        System.out.println("my name is："+name+"i am "+age+"years old");
    }
}

class Qf extends People{
    String school;
    int stunum;
    void say(){ //复写 Peopel类的say()
        System.out.println("my name is："+name+" i am from "+ school+". i am "+age+"years old");
    }

    void saynum(){
        System.out.println("my student number is "+stunum);
    }
}


public class test1212_jicheng {
    public static void main(String[] args) {
        Qf q = new Qf();
        q.stunum=23;
        q.name="qf";
        q.age=211;
        q.school="hl";
        q.saynum();
        q.say();
    }
}
