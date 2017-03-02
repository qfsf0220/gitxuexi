package KFjava;

/**
 * @author feng.qian
 * @create at 2017-03-02 15:42
 */


public class zifutransfer {
    public static void  main(String[] args) {
        int a = 6;
        float f = a;//int 可以自动转换为float类型
        System.out.println(f);//这里输出6.0
        byte b = 9;
        short s = b;
        //char c = b; //byte不能自动转换为char类型
        double d = b;  //byte  short int long
        System.out.println(d);//输出9.0

        //String teststr = 5; 这个是错误的。整数不能直接复制给一个字符串
        //一个基本类型的值 和字符串连接运算是，基本类型自动转成字符串
        String str2 = 3.5f + "";
        System.out.println(str2);
        System.out.println(3+4);
        System.out.println(3 + 4 + "是几？");
        System.out.println("是几？"+ 3 + 4);//这里 是几+3 变成 ”是几3“ 在加4

        System.out.println("----强制类型转换-----");
        int inttt= 321;

        byte bytee = (byte)inttt;
        // 这里321 变成 65 的过程是
        // int 321 二进制对应的 101000001
        /* byte 是8位的  short 16 int 是32位 long64
           所以变成byte 就是 01000001
           正数的话 直接转成10进制 就是64 +1  65

           如果是负数
           要先按位取反再加1 然后才能算出来表示的数值
            如果是 11101001

            取反 10010110 +1  ->10010111

         */
        System.out.println(bytee);
        double doublee = 9.99;
        int intt2 = (int)doublee;
        System.out.println(intt2);
        //一般情况下 字符串不能直接转换位基本类型。需要通过对应的包装类实现字符串转换
        String stra= "45";
        int intstr = Integer.parseInt(stra);
        System.out.println(intstr);

    }


}



