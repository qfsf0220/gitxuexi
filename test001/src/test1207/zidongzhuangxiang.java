package test1207;

/**
 * 自动装箱就是把一个基本类型的变量直接赋给对应的包装类变量，
 * 或者赋给Object变量（Object是所有类的父类，子类对象
 * 可以直接赋给父类变量）
 *
 *自动拆箱相反，允许直接把包装类直接赋给一个对应的基本类型变量。
 * @author feng.qian
 * @create at 2016-12-07 16:51
 */


public class zidongzhuangxiang {
    public static void main(String[] args) {
//把一个基本类型变量赋给Integer 对象
        Integer int1 = 555;

        //把一个boolean类型变量 赋给一个object类型的变量
        Object bool1=true;
        //吧一个Integer对象赋给int类型变量
        int int2 = int1;
        System.out.println("int1:"+int1);
        System.out.println("int2:"+int2);

        if(bool1 instanceof Boolean){
            boolean b= (boolean)bool1;
            System.out.println("boolean:"+b);
        }

        String shuzi = "123";
        long int123 = 1535;
        int num1 = Integer.parseInt(shuzi);
        System.out.println(num1);
        int num2 = (int)int123;
        System.out.println(num2);

        String floatstr = "4.567";
        float ft1 = Float.parseFloat(floatstr);
        float ft2;
        ft2 = new Float(floatstr);

        String fstr = String.valueOf("2.3456");
        System.out.println(fstr);
        System.out.println(num1+"2opqrst");
    }


}
