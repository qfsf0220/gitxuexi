package KFjava;

import java.util.DoubleSummaryStatistics;

/**
 * @author feng.qian
 * @create at 2017-03-01 15:57
 */


public class floattest {
    public static void main(String[] args) {
        float fa = 5.55123456f;
        System.out.println(fa);//这里输出显示为 5.5512347
        double da = 0.0;
        double c = Double.NEGATIVE_INFINITY;
        float d = Float.NEGATIVE_INFINITY;
        System.out.println( c == d ); //true 说明float 和double的负无穷大一样的。
        System.out.println(da/da);//x 除以 0.0 将出现非数
        //两个非数之间是不相等的
        System.out.println(da/da == Float.NaN);
        //所有正无穷大都是相等的
        System.out.println(6.0/0 == 555.0/0);
        //负数除以0.0等到负无穷大
        System.out.println(-8/da);
        //整数除以0 （不是 0.0） 会出现零除异常
        //System.out.println(0/0);
        System.out.println("数值中使用下划线分隔");
        long binva = 0B0000_0000_0000_0000_0111;//0B代表这个是个2进制数  111就是 1+2的1次方+2的2次方
        int binvb = 0000_0000_0000_0111; //0开头就是代表这个是8进驻数   111就是1+8的一次方+8的2次方
        int binvc = 111;  //这个是10进制    111就是111
        int binvd = 0x111;  //0x 开头代表16进制    1+16^1+16^2 （1+16+256 = 273）
        double pi = 3.14_15_92_65_36;
        System.out.println(binva);
        System.out.println(binvb);
        System.out.println(binvc);
        System.out.println(binvd);
        System.out.println(pi);
        double hhh = 8_8_8_8.2222;
        System.out.println(hhh);

    }
}
