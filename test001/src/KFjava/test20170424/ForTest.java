package KFjava.test20170424;

/**
 * Created by Administrator on 2017/4/24.
 */
public class ForTest {
    public  static void main (String args []){
        for (int count =1,count2 =1;count <10 && count2<10;count++ ){

            System.out.println("-------");
            System.out.println(count);
            System.out.println(count2++);
        }
        System.out.println("loop  over.");
    }
}
