package test20180319;

import org.apache.logging.log4j.core.config.plugins.util.ResolverUtil;

import java.lang.annotation.Annotation;

/**
 * Created by Administrator on 2018/3/20.
 */
public class BoundedTypeParameters {
    public static <T extends Comparable<T>> T maximum(T x,T y,T z){
        T max = x; // assume x is  initially the largest
        T cf = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max )> 0 ){
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximum('5', 'a', 'G'));
        System.out.println(maximum(1, 2, 3));
        System.out.println(maximum("你","好","啊"));
    }
}
