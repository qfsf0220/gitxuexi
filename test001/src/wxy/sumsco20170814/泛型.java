package wxy.sumsco20170814;

import java.util.DoubleSummaryStatistics;

/**
 假如我们现在要定义一个类来表示坐标，要求坐标的数据类型可以是整数、小数和字符串，例如：
   x = 10、y = 10
   x = 12.88、y = 129.65
   x = "东京180度"、y = "北纬210度"

 针对不同的数据类型，除了借助方法重载，还可以借助自动装箱和向上转型。我们知道，基本数据类型可以自动装箱，被转换成对应的包装类；Object 是所有类的祖先类，任何一个类的实例都可以向上转型为 Object 类型，例如：
   int --> Integer --> Object
   double -->Double --> Object
   String --> Object
 */
public class 泛型 {
    public static void main(String[]a){
        Point p = new Point();
        p.setX(10);
        p.setY(20);
        int ix= (Integer) p.getX();
        int iy=(Integer)p.getY();
        System.out.printf(  "%d , %d\n",ix,iy );

        p.setX(12.3);
        //p.setY("36.7") //这里向下转型存在问题，编译可以通过，但是运行是会跑出异常，所以需尽量避免向下转型。。
        p.setY(34.5);
        double dx =(Double)p.getX();
        double dy = (Double)p.getY();
        System.out.printf(  "%.3f , %.3f\n",dx,dy );


        p.setX("Hi");
        p.setY("各位老总");
        String sx = (String)p.getX();
        String sy = (String)p.getY();
        System.out.printf(  "%s , %s\n",sx,sy );
    }


}

class Point {
    Object x = 0;
    Object y = 0;

    public Object getX() {
        return x;
    }

    public void setX(Object x) {
        this.x = x;
    }

    public Object getY() {
        return y;
    }

    public void setY(Object y) {
        this.y = y;
    }
}