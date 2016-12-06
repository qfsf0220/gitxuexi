package test1206;

import java.util.Objects;

/**
 * 强制类型转换的例子
 *
 * @author feng.qian
 * @create at 2016-12-06 13:22
 */


public class instanceoftest {
    public static void main(String[] args) {
        double d = 15.5;
        long l  = (long)d;
        System.out.println(l);
        int in = 5;
        //试图把一个类型的变量变成 boolean类型的
        //下面的的代码编译出错，
        //boolean b = (boolean)in;
        Object obj = "hello";
        //obj变量的编译时类型为Object，object存在继承关系，可以
        //强制类型转换，而且obj变量的实际类型是String，运行也可以通过
        String objStr= (String)obj;
        System.out.println(objStr);
        Object objPri = new Integer(5);
        if (objPri instanceof String) {
            String str = (String) objPri;
        }

        Object abc= "abc";
        System.out.println("字符串是否是Objec类的实例："+(abc instanceof Object));
        System.out.println("字符串是否是String类的实例："+(abc instanceof String));
        System.out.println("字符串是否是Math类的实例："+(abc instanceof Math));
        System.out.println("字符串是否是Comparble类的实例："+(abc instanceof Comparable));



    }
}
