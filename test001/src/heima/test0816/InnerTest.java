package heima.test0816;

/**
 * Created by Administrator on 2017/8/16.
 * 内部类可以直接访问外部类的成员，包括私有private
 * 外部类访问内部类 ，需要建立内部类对象。
 */
class Outer{
    private int x = 3;
    class Inner{   // 正常情况下 类无法使用 私有 或者 静态。但是内部类可以。如果是静态内部类，在外部类加载完成时  这个静态内部类也能直接调用 使用它的方法。
        int x =4;
        void methodin(){
            int x = 5;
            System.out.println(x+" inner"); //5
            //输出4
            System.out.println(this.x);
            //输出3
            System.out.println(Outer.this.x);
        }
    }
    void methodout(){//这里外部类方法访问的话  需要建立对象。
        Inner  in = new Inner();
        in.methodin();
    }
}
class outerTest{
    public static void main(String[]a){
        Outer o = new Outer();
        o.methodout();
        System.out.println("-------------");
        //直接访问内部类中的成员
        Outer.Inner oi = new Outer().new Inner();
        oi.methodin();
    }
}
