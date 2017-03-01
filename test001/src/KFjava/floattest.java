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
        int binva = 0B1000_0000_0000_0000_0000_0011;
        double pi = 3.14_15_92_65_36;
        System.out.println(binva);
        System.out.println(pi);
        double hhh = 8_8_8_8.2222;
        System.out.println(hhh);

    }
}
