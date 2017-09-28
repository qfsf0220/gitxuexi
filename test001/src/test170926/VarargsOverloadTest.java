package test170926;

/**
 * Created by Administrator on 2017/9/28.
 */
public class VarargsOverloadTest {
    public static void main(String[] args) {
        a(1, 2, 3,4);
        a("hello", 1, 3);
        a(true, false, false);
    }
        static void a(int ... in) {
            System.out.println("args number:" + in.length);

            for (int i : in) {
                System.out.print(i + " ");
                System.out.println();
            }
        }
        static void a(boolean ... bl){
            System.out.println("args number:"+bl.length);
            for (boolean i:bl){
                System.out.print(i+" ");
                System.out.println();
            }
    } static void a(String msg, int ... in){
            System.out.println("welcome msg:"+msg+" args number:"+in.length);
            for (int i:in){
                System.out.print(i+" ");
                System.out.println();
            }
    }
}
