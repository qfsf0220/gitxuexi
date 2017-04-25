package KFjava.test20170424;

/**
 * Created by Administrator on 2017/4/25.
 */
public class ReturnTest {
    public static void main (String args []){
        for (int i = 0;i<10;i++){
            System.out.print("i现在是："+i+"\n");
            if (i ==5){
                System.out.println("结束");
                return;

            }
            System.out.println("return 后输" + "语句");
        }

    }
}
