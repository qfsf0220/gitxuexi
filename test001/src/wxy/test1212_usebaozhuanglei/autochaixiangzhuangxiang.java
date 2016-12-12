package wxy.test1212_usebaozhuanglei;

/**
 * 上面的例子都需要手动实例化一个包装类，称为手动拆箱装箱。
 *
 Java 1.5 之后可以自动拆箱装箱，也就是在进行基本数据类型和对应的包装类转换时，系统将自动进行，这将大大方便程序员的代码书写。
 * @author feng.qian
 * @create at 2016-12-12 10:31
 */


public class autochaixiangzhuangxiang {
    public static void main(String[] args) {
        int m = 500;
        Integer oo = m;
        int n = oo;
        System.out.println("n="+n);

        Integer o2 =500;
        System.out.println(oo.equals(o2));
    }
}
