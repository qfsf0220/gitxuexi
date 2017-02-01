package mz.test001_17130;

import java.util.Scanner;

/**
 * Created by qf on 2017/2/1.
 */
public class shuju_leixing_zhuanhuan {
    public  static void main(String[]args){
        int x = (int)123.789;

        System.out.println(x);

        byte y = (byte)129; //这里int 赋值给byte 或者short时，不可以超出这些变量的取值范围。否则需要进行类型转换运算。 这里 129 已经超出bbyte取值极限 2的7次方-1 所以 精度丢失
        System.out.println(y);

        float z = (float) 123.456; //默认的 123.456 其实是个double类型 指定为float是需要向下转型的 所以报错，需要加个 F 或者（float）强制转换。
        System.out.println(z);

    Scanner sc = new Scanner(System.in);
    System.out.println("input a double:");
    double a = sc.nextDouble();
    System.out.println("you input is "+a);
    System.out.printf("浮点数：%f 字符串：%s int类型：%d  char类型：%c\n",a,String.valueOf(a),(int)a,(char)a);
        System.out.println("-----------");
//    System.out.println("input a double 2:");
//    double b= sc.nextDouble();
        double b= 123.34567898765;
        System.out.printf("%020.3f %n",b);
        System.out.println(" //注意 这里 %f是输出float类型数字  在 <% 里面的.3 是保留小数点后面3位u  .3 前面的 20 就是占位 占了20位  20 前面的0 意思就是 拿0来占位  f> \n");
        System.out.printf("%3$s %2$s %1$s %n",1,2,3 );
        System.out.printf("%b///%b",true,false);

    }
}
