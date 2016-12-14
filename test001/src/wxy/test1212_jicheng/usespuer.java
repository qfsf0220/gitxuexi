package wxy.test1212_jicheng;

/**
 * super 关键字与 this 类似，this 用来表示当前类的实例，super 用来表示父类。
 *
 * @author feng.qian
 * @create at 2016-12-12 13:58
 *
 * super 可以用在子类中，通过点号(.)来获取父类的成员变量和方法。super 也可以用在子类的子类中，Java 能自动向上层类追溯。

父类行为被调用，就好象该行为是本类的行为一样，而且调用行为不必发生在父类中，它能自动向上层类追溯。
 *  super 关键字的功能：
        调用父类中声明为 private 的变量。
        点取已经覆盖了的方法。
        作为方法名表示父类构造方法。
 */
class father{
    private String name ="qf";

    public String getName() {//必须要声明一个 getXxx方法
        return name;
    }
    public void eat() {
        System.out.println("i am eating.");
    }
}

class son extends father{
    public void eat(){
        super.eat();//调用父类的方法
        //通过getXxx方法调用父类的隐藏变量
        System.out.println(super.getName());
    }
}


public class usespuer {
    public static void main(String[] args) {
        son m = new son();
        m.eat();
    }
}
