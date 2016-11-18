/**
 * Created by mac on 16/11/18.
 */
import  java.util.*;
import java.util.stream.StreamSupport;

public class threeinttest {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1 number");
        int num1 = in.nextInt();
        System.out.println("enter 2 number");
        int num2 = in.nextInt();
        System.out.println("enter 3 number");
        int num3=in.nextInt();

        int cc = threemax(num1,num2,num3);
        System.out.println("max is :"+cc);
        int cc2 = threemax2(num1,num2,num3);
        System.out.println(cc2);
        int cc3 = threemax3(num1,num2,num3);
        System.out.println(cc3);

    }

    public static int threemax(int a,int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        }else{
            if(b>c){return b;}
            else{return c;}
        }

    }

    public static int threemax2(int a,int b,int c){
        if(a>b){
            return a>c? a:c; //a大于b，如果a还大于c a最大，不然c>a>b c最大
        }else{
            return b>c? b:c; //b大于a,如果b>c b最大，不然c>b>a c最大。
        }
    }
    public static int threemax3(int a,int b ,int c){
        return a>b? a>c? a:c:b>c? b:c; //阅读性一般
        /*
        *  int temp = a>b? a:b ;
        *  int max = temp>c? temp:c ;
        *  return max
        * */
    }


}
