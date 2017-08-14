package wxy.sumsco20170814;

import java.util.DoubleSummaryStatistics;

/**
 * 上面的泛型.java这个类   向下转型存在问题，编译可以通过，但是运行是会跑出异常，所以需尽量避免向下转型。。
 这里  可以使用泛型类(Java Class)，它可以接受任意类型的数据。所谓“泛型”，就是“宽泛的数据类型”，任意的数据类型。
 */
public class 泛型修改 {
    public static void main(String[]a){
        Point2<Integer,Integer> p2 = new Point2<Integer,Integer>();
        p2.setX(111);
        p2.setY(222);
        int x = p2.getX();
        int y = p2.getY();
        System.out.printf( "%d  ,  %d\n",x,y);
        Point2<Double,String> p3=new Point2<Double,String>();
        p3.setX(176.5);
        p3.setY("身高");
        double dx=p3.getX();
        String sy = p3.getY();
        System.out.printf("%s :%.2f  ",sy,dx);
    }
}

//定义泛型类
class Point2<T1,T2>{
    T1 x;
    T2 y;
    public T1 getX() {
        return x;
    }

    public void setX(T1 x) {
        this.x = x;
    }

    public T2 getY() {
        return y;
    }

    public void setY(T2 y) {
        this.y = y;
    }
}