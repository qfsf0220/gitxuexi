package LYlesson;

/**
 * Created by Administrator on 2017/9/7.
 */
import java.lang.StringBuffer;
import java.lang.String;
public class StringReverse {
    public static void main(String[] args) {
        String s1="abcdef";
        String reverses1 = new StringBuffer(s1).reverse().toString();
        System.out.println("String before reverse:"+s1);
        System.out.println("String after reverse: "+reverses1);
    }
}
