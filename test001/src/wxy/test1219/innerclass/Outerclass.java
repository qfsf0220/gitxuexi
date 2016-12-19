package wxy.test1219.innerclass;

/**
 * 在 Java 中，允许在一个类（或方法、语句块）的内部定义另一个类，称为内部类(Inner Class)，有时也称为嵌套类(Nested Class)。
 *
 * @author feng.qian
 * @create at 2016-12-19 14:15
 *
 *
 * 内部类和外层封装它的类之间存在逻辑上的所属关系，一般只用在定义它的类或语句块之内，实现一些没有通用意义的功能逻辑，在外部引用它时必须给出完整的名称。

使用内部类的主要原因有：
内部类可以访问外部类中的数据，包括私有的数据。
内部类可以对同一个包中的其他类隐藏起来。
当想要定义一个回调函数且不想编写大量代码时，使用匿名(anonymous)内部类比较便捷。
减少类的命名冲突。
 */


public class Outerclass {
    private int size;
    public class Inner{
        private int counter=10;
        public void doStuff(){
            size++;
        }
    }


    public static void main(String[] args) {
        Outerclass out = new Outerclass();
        Inner in = out.new Inner();
        in.doStuff();
        System.out.println(out.size);
        System.out.println(in.counter);
        //System.out.println(counter);这个是错误的。
        //外部类不能访问内部类的变量。

    }
}
