package test1203;

/**
 * Created by qfsf on 2016/12/3.
 */
class digui{
    public static int numsum(int i){
        if (i==1) return 1; //程序出口,退出循环
        else {
            return i+numsum(i-1);
        }
    }
}

public class classdigui {
    public static void main(String[] args) {
        digui dd = new digui();
            int a5 = digui.numsum(5);
        System.out.println("sum is :"+a5 );
        }
}
