package wxy.test1212_usebaozhuanglei;

/**
 * 实现 int 和 Integer 的相互转换
 *可以通过 Integer 类的构造方法将 int 装箱，通过 Integer 类的 intValue 方法将 Integer 拆箱。
 *
 * @author feng.qian
 * @create at 2016-12-12 9:56
 */


public class intToInteger {
    public static void main(String[] args) {
        int m  = 500;
        Integer oo =new Integer(m);//手动装箱
        int n =oo.intValue(); //手动拆箱
        System.out.println("n="+n);

        Integer o2 = new Integer(500);//手动装箱
        int n2 =o2.intValue();

        System.out.println(o2.equals(oo));


    }
}
