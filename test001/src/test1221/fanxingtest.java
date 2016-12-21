package test1221;

import org.omg.CORBA.DoubleHolder;
import org.omg.CORBA.INTERNAL;
import org.omg.PortableInterceptor.INACTIVE;
import wxy.test1219.innerclass.Outerclass;

/**
 * @author feng.qian
 * @create at 2016-12-21 10:24
 * 我们知道，使用变量之前要定义，定义一个变量时必须要指明它的数据类型，什么样的数据类型赋给什么样的值。

假如我们现在要定义一个类来表示坐标，要求坐标的数据类型可以是整数、小数和字符串，例如：
x = 10、y = 10
x = 12.88、y = 129.65
x = "东京180度"、y = "北纬210度"

针对不同的数据类型，除了借助方法重载，还可以借助自动装箱和向上转型。我们知道，基本数据类型可以自动装箱，被转换成对应的包装类；Object 是所有类的祖先类，任何一个类的实例都可以向上转型为 Object 类型，例如：
int --> Integer --> Object
double -->Double --> Object
String --> Object
 */

class Point<T1,T2>{
    T1 x ;
    T2 y ;

    public T1 getX() {
        return x;
    }

    public T2 getY() {
        return y;
    }

    public void setX(T1 x) {
        this.x = x;
    }

    public void setY(T2 y) {
        this.y = y;
    }
}


public class fanxingtest {
    public static void main(String[] args) {
        Point <Integer,Integer> p= new Point<>();
        p.setX(10);
        p.setY(20);

        int x = (Integer)p.getX();
        int y = (Integer)p.getY();
        System.out.println("this point is:"+x +","+y);


        Point<Double,String> p2 = new Point<>();
        p2.setX(25.5);
        p2.setY("东经25度");
        double m = (Double)p2.getX();
        String n =(String) p2.getY();
        System.out.println("this point is:"+m +","+n);


    }
}
