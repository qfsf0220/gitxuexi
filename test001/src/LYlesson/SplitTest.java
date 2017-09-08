package LYlesson;

/**
 * Created by Administrator on 2017/9/7.
 */
public class SplitTest {
    public static void main(String[] args) {
        String a = "this.is.a.test";
        String aa[]=a.split("\\.");
        for(String i :aa){
            System.out.println(i);
        }

    }
}
