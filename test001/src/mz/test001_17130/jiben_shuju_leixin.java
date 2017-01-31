package mz.test001_17130;

/**
 * Created by qfsf on 2017/1/30.
 * 2233445566
 */
public class jiben_shuju_leixin {
    public static void main(String[]args) {
        System.out.printf("逻辑类型： \n常亮 ：true false \n变量：使用关键字 boolean 来声明逻辑变量，声明是也可以赋给初始值  例如：boolean x,ok = true ,关闭 = false");
        System.out.println("===============");
        System.out.printf("整数类型：\nint类型 常量：\n 123，6000（10进制） ，077 （8进制），0x3ABC（16进制）\n变量: 使用关键字int声明的int变量，声明时也可以赋给初始值。例如  int a = 12,平均 = 1234，abc\n");
        System.out.printf("byte\t内存分配1个字节，占8位。2的-7次方到2的7次方-1\nshort\t内存分配2个字节，占16位。2的-15次方 到 2的15次方-1\nint\t\t内存分配4个字节（byte）,占32位。2的-31次方到2的31次方-1\nlong\t内存分配8个字节，占64位。2的-63次方到2的63次方-1\n");


        int x = 12, 平均 = 1234, qian;

        byte bx = -12, tom = 29, 那风格xx;

        short sx = 12323, y = 123, 的广泛地;

        long wid = 0x3ABCL, hei = 33333L, leng;

        char ch = 'A', home = '家', zhuanyi = '\n', handsom; //这里handsom没有赋给初值

        System.out.println("\"char 类型变量  内存分配2个字节，占16位 同 short\"");
        System.out.println("要观察一个字符在Unicode表中的顺序位置，可以使用int类型显示转换，如(int)'a' or int p = 'a'  ");
        System.out.println("若要得到一个 0-65535之间的数 所代表的unicode、表中相对应位置上额字符必须使用char型显示转换。");
        System.out.println("-------- test --------");

         char ch1= '春',ch2 = '节';

         System.out.println(ch1+"对应的unicode位置"+(int)ch1+ "  "+ch2+"对应的unicode位置"+(int)ch2);
        System.out.printf("%s对应的位置%d\t%s对应的位置%d",ch1,(int)ch1,ch2,(int)ch2);






    }
}
