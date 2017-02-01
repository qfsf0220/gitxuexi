package mz.test001_17130;

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

    }
}
