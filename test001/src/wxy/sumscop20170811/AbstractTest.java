package wxy.sumscop20170811;

/**
 关于抽象类的几点说明：
 ●●抽象类不能直接使用，必须用子类去实现抽象类，然后使用其子类的实例。然而可以创建一个变量，其类型是一个抽象类，并让它指向具体子类的一个实例，也就是可以使用抽象类来充当形参，实际实现类作为实参，也就是多态的应用。
 ●●不能有抽象构造方法或抽象静态方法。


 在下列情况下，一个类将成为抽象类：
 1.当一个类的一个或多个方法是抽象方法时；
 2.当类是一个抽象类的子类，并且不能为任何抽象方法提供任何实现细节或方法主体时；
 3.当一个类实现一个接口，并且不能为任何抽象方法提供实现细节或方法主体时；注意：
     ●这里说的是这些情况下一个类将成为抽象类，没有说抽象类一定会有这些情况。
     ●一个典型的错误：抽象类一定包含抽象方法。 但是反过来说“包含抽象方法的类一定是抽象类”就是正确的。
     ●事实上，抽象类可以是一个完全正常实现的类


 */
public class AbstractTest {
    public static void main(String[] a) {
        Qf qf = new Qf();
        qf.setName("qf");
        qf.work();
        Sf sf = new Sf();
        sf.setName("sf");
        sf.work();
    }
}
//抽象类不能被实例化，抽象方法必须在子类中被实现。
    abstract class People{//抽象类 People
        private String name;//实例变量
        //共有的setter方法和 getter方法
        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
        //抽象方法
        public abstract void work();
    }
    //必须实现抽象方法
    class Qf extends People{
        public void work(){
            System.out.println("qf : my name is "+this.getName());
        }
    }
    //同上 必须实现该方法
    class Sf extends People{
        public void work(){
            System.out.println("sf: my name is "+this.getName());
        }
    }





