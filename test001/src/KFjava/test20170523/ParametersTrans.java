package KFjava.test20170523;

/**
 * Created by Administrator on 2017/5/24.
 */

class abcabc{
    String a;
    String b;
    int c;
    double d;
}

public class ParametersTrans {
    public static void main(String []args){
        abcabc abc = new abcabc();
        abc.a="qwe";
        abc.c=123;
        printabc(abc);

    }

    static void printabc(abcabc abc) {
        System.out.println(abc.a+"  "+abc.b+"  "+abc.c+"  "+abc.d);
    }
    
}
