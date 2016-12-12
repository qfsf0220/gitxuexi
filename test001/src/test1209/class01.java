package test1209;

/**
 * Java类的定义及其实例化
 *
 * @author feng.qian
 * @create at 2016-12-09 18:16
 */
class Dog{
    String name;
    int age;

    void bark(){  // 汪汪叫
        System.out.println("汪汪，不要过来");
    }

    void hungry(){  // 饥饿
        System.out.println("主人，我饿了");
    }
}

public class class01 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
    }
}
