package test1209;

/**
 *
 *子类拥有父类非private的属性，方法和构造器。
 *
 子类可以拥有自己的属性和方法，即子类可以对父类进行扩展。

 子类可以用自己的方式实现父类的方法。

 Java的继承是单继承，但是可以多重继承，单继承就是一个子类只能继承一个父类，多重继承就是，例如A类继承B类，B类继承C类，所以按照关系就是C类是B类的父类，B类是A类的父类，这是java继承区别于C++继承的一个特性。

 提高了类之间的耦合性（继承的缺点，耦合度高就会造成代码之间的联系）。
 *
 * @author feng.qian
 * @create at 2016-12-09 14:34
 */
class test1{
    private int a;
    private int b;
    public test1(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void print(){
        System.out.println("testprint"+a+b);
    }
    void voice(){
        System.out.println("testvoice"+a+b);
    }
}

class test2 extends test1{
    public test2(int a, int b) {
        super(a, b);
    }
}

public class thisisatest {
    public static void main(String[] args) {
        test2 t= new test2(5,6);
        t.voice();
        t.print();
    }
}
