package dongli.test170727;

import javax.sound.midi.Soundbank;

/**
 * Created by qf on 2017/7/29.
 */
public class Test001 {
    public static void main(String [] arrrrrgs){
        System.out.println(Test001.m(5,6));
        System.out.println(m(1L,6L));
        System.out.println(m(5.8,2.2));

        System.out.println( sum(5)  );

    }

    public static String m(int a ,int b){
        return (a>3? b:0)>(b>2?2:3) ? "qf":"sf";
    }

    public static  String m (long a,long b){
        return (a>3? b:a) > (a>9? a:a) ? "qqff":"ssff";
    }

    public  static double m (double a,double b){
        return (a>3? a:b) < (b-a>6? a:b) ? a:b;
    }

//返回 1~a 所有数字的和 (普通方式)
    public static int sum(int a){
        int result =0;
        for (int i =1 ;i<=a;i++ ){
            result +=i;
        }
        return result;
    }

    //(递归方法)
    public static int sum2 (int a){
        if (a==1){
            return 1;
        }
        return a+sum2(a-1);
    }

}
