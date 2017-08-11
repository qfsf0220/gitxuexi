package wxy.sumscop20170811;

/**
 使用内部类的主要原因有：
 内部类可以访问外部类中的数据，包括私有的数据。
 内部类可以对同一个包中的其他类隐藏起来。
 当想要定义一个回调函数且不想编写大量代码时，使用匿名(anonymous)内部类比较便捷。
 减少类的命名冲突。
 */
public class OuterClassTest {
    private int size;

    // Inner、Inner2 间可以互相调用
    public class Inner{
        private int counter = 10;
        public void dosome(){
            size++;
        }
    }

    public  class Inner2{
        private int counter = 11;
        public void dosome2(){
            size++;
        }
    }

    public void test(){
        Inner in = new Inner();
        in.dosome();
    }

    public static void main(String[]a){
        OuterClassTest  outer = new OuterClassTest();
        Inner inner  = outer . new Inner();
        inner.dosome();
        System.out.println(outer.size);

        System.out.println(inner.counter);
        //System.out.println(outer.counter);
        //System.out.println(counter);//这里编译错误，外部类无法访问内部类的变量。

        }
    }

