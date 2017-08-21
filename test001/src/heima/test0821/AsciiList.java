package heima.test0821;

/**
 * Created by Administrator on 2017/8/21.
 */
public class AsciiList {
    public static void main(String[] args) {
        for(int i=0;i<255;i++){
            char a = (char) i;
            System.out.println(a+" - "+i);
        }
        char x='钱';
        System.out.println((int) x);

        String x2 = "张总";
        char[]a =x2.toCharArray();
        for(char ch: a){
            System.out.println((int)ch);
        }
    }
}
