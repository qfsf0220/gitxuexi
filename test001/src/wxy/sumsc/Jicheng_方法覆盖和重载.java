package wxy.sumsc;

/**
 方法覆盖的原则：
 覆盖方法的返回类型、方法名称、参数列表必须与原方法的相同。
 覆盖方法不能比原方法访问性差（即访问权限不允许缩小）。
 覆盖方法不能比原方法抛出更多的异常。
 被覆盖的方法不能是final类型，因为final修饰的方法是无法覆盖的。
 被覆盖的方法不能为private，否则在其子类中只是新定义了一个方法，并没有对其进行覆盖。
 被覆盖的方法不能为static。如果父类中的方法为静态的，而子类中的方法不是静态的，但是两个方法除了这一点外其他都满足覆盖条件，那么会发生编译错误；反之亦然。即使父类和子类中的方法都是静态的，并且满足覆盖条件，但是仍然不会发生覆盖，因为静态方法是在编译的时候把静态方法和类的引用类型进行匹配。

 方法的重载：
 前面已经对Java方法重载进行了说明，这里再强调一下，Java父类和子类中的方法都会参与重载，例如，父类中有一个方法是 func(){ ... }，子类中有一个方法是 func(int i){ ... }，就构成了方法的重载。

 覆盖和重载的不同：
 方法覆盖要求参数列表必须一致，而方法重载要求参数列表必须不一致。
 方法覆盖要求返回类型必须一致，方法重载对此没有要求。
 方法覆盖只能用于子类覆盖父类的方法，方法重载用于同一个类中的所有方法（包括从父类中继承而来的方法）。
 方法覆盖对方法的访问权限和抛出的异常有特殊的要求，而方法重载在这方面没有任何限制。
 父类的一个方法只能被子类覆盖一次，而一个方法可以在所有的类中可以被重载多次。
 */
public class Jicheng_方法覆盖和重载 {
    public static void main(String[]a){
        Animmm a1= new Animmm("小智");
        a1.say();
        Doggg a2 = new Doggg("小茂");
        a2.say();
    }
}

class Animmm{
    String name;
    public Animmm(String name){
        this.name=name;
    }
    public void say(){
        System.out.printf("my name is %s(Animmm)\n",name);
    }
}
class Doggg extends Animmm{
    public Doggg(String name){
        super(name);
    }
    public void say(){
        System.out.printf("my name is %s(Doggg)\n",name);
    }

}
