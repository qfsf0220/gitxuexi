package KFjava.test20170424;

/**
 * Created by Administrator on 2017/4/24.
 */
//dowhile 不同while之处在于 dowhile 不管expression对错 至少会运行do内操作1次。
public class DoWhileTest {
    public static void main(String [] args){
        int count = 100;
        do {
            System.out.println(count);
            ++count;

        }while(count <10);
        System.out.println("loop stop.");
    }
}
