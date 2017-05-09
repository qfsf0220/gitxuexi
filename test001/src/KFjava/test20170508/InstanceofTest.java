package KFjava.test20170508;

import java.util.Objects;

/**
 * Created by Administrator on 2017/5/9.
 */
public class InstanceofTest {
    public  static void main(String []args){
        Object obj = "qqq";
        System.out.println(obj);
        System.out.println((obj instanceof String));
        System.out.println((obj instanceof Object));
        System.out.println((obj instanceof Math));//math与Object类存在继承关系
        System.out.println((obj instanceof Comparable));//String实现了Comparable借口

        String a = "qwe";
//        System.out.println(a instanceof  Math);// 这里String类与Math类没有继承关系，所以无法编译通过。



    }
}
