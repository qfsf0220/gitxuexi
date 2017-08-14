package wxy.sumsco20170814;

/**
 * Created by Administrator on 2017/8/14.
 */
public class 泛型方法 {
    public  static void main(String []a){
        Point3<Integer,Integer> p4= new Point3<>();
        p4.setX(1111);
        p4.setY(2222);
        p4.printinfo(p4.getX(),p4.getY());

        p4.printinfo2(p4.getX(),p4.getY());
    }
}
//定义泛型类
class Point3<T1,T2>{
    T1 x;
    T2 y;

    public void setX(T1 x) {
        this.x = x;
    }

    public void setY(T2 y) {
        this.y = y;
    }

    public T1 getX() {
        return x;
    }

    public T2 getY() {
        return y;
    }
    //定义泛型方法
    public <x,y> void printinfo(x a,y b){
        x m =a;
        y n = b;
        System.out.printf( " %s ,  %s \n" ,m,n);
    }

    public void printinfo2(Object c,Object d){
        System.out.printf("%s   ,   %s",c,d);
    }
}

