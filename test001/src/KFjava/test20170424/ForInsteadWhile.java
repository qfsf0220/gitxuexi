package KFjava.test20170424;

/**
 * Created by Administrator on 2017/4/24.
 */
public class ForInsteadWhile {
    public static void main(String args []){
        int count = 0 ;
        for (;count<10;){//如果需要无限循环  直接 For(;;) 省略for循环的三个部分，条件直接为True
            System.out.println(count);
            count++;
        }
        System.out.println("loop   .jieshu..");
    }
}
