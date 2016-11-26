/**
 * Created by qfsf on 2016/11/26.
 */
import java.util.Scanner;
class demo3{
    //add
    public int add(int a,int b){
        return a+b;
    }
    //-
    public int sub(int a,int b){
        return a-b;
    }
    //*
    public int mul(int a ,int b){
        return a*b;
    }
    // %
    public int div(int a,int b){
        return a/b;
    }
}

public class classdemo3 {
    public  static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.print("first num:");
        int num1 = in.nextInt();
        System.out.print("second num:");
        int num2 = in.nextInt();

        demo3 d = new demo3();
        System.out.println("+:"+d.add(num1,num2));
        System.out.println("-:"+d.sub(num1,num2));
        System.out.println("*:"+d.mul(num1,num2) );
        System.out.println("%:"+d.div(num1,num2));

    }
}
