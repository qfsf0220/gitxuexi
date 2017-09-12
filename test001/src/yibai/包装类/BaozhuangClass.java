package yibai.包装类;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by Administrator on 2017/9/12.
 */
public class BaozhuangClass {
    int int1 = 2_012;
    static int int2 = 2__12;
    public  static void staticmethod(){
        Integer int1 = new Integer("2012");

        Double dou1 = new Double("12.345");

        Character char1 = new Character('A');

        Boolean bool1 = new Boolean("true");

        System.out.printf("%d,%d,%d",int1,int2,int1);
        System.out.println();
        System.out.printf("%f,%s,%s",dou1,char1,bool1);
    }

    public static void main(String[] args) {
        staticmethod();
        Integer int2  =Integer.valueOf(100);
        byte b= int2.byteValue();


    }
}
