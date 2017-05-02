package KFjava.test20170428;

/**
 * Created by Administrator on 2017/5/2.
 */
public class Recurisve {
    public static int fn(int n){
        if(n==0){
            return 1;
        }
        else  if (n==1){
            return 4;
        }
        else{
//            return 2*fn(n-1)+fn(n-2);
            return 2*fn(n-1);
        }
    }
    public static void main(String[]args){
        System.out.println(fn(5));
    }
}
