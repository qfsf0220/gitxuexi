package KFjava.test20170523;

/**
 * Created by Administrator on 2017/5/23.
 */
public class StuNo {
    int a;
    String b;
    double c;
    StuNo(){}
    StuNo(int a){
        super();//这里显示的添加了 继承父类的构造器。默认是不继承的。

        this.a =a;
        System.out.println("x123x");
    }
    StuNo(double ddd ,String abc){
//        this(a);  super 继承父类构造器  this调用本类构造器
        this.b=abc;
        this.c=ddd;
    }

    public  static void main(String []args){
        StuNo sn = new StuNo(5);
    }

}
