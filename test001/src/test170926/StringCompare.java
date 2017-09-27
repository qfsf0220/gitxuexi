package test170926;
import java.util.Scanner;
/**
 * Created by Administrator on 2017/9/26.
 */
public class StringCompare {


    public static void main(String[] args) {
        String a = new String("aaa");
        String b = "aaa";
        Object os = a;
        String a1 = new String(a);
        String c= "cccc";
        String d ="aaa";

        int i = a.compareTo(b);
        System.out.println(i);
        int i2 = a.compareTo(c);
        System.out.println(i2);

        System.out.println(a.compareToIgnoreCase(b));
        System.out.println(a.compareTo(os.toString()));

        System.out.println("---");
        System.out.println(a.equals(a1));
        System.out.println(a.equals(d));
        System.out.println(b.equals(d));
        System.out.println(d.equals(c));
        System.out.println("---");
        System.out.println(a==b);
        System.out.println(b==d);
        System.out.println(a1==a);

        String sss="abc123";
        StringBuffer reverse = new StringBuffer(sss).reverse().insert(1,i);
        System.out.println(reverse);

        String sss2 = "qfsf.com";
        String rsss2 = new StringBuffer(sss2).reverse().toString();
        System.out.println(rsss2);

        String sss3 = "ctrl shift alt";
        char [] cs3 = sss3.toCharArray();
        System.out.println(cs3.length);
//        for (char cc1 :cs3){
//            System.out.println(cc1);
//        }
        char [] rcs3 =new char[cs3.length+1];
        int aa =0;
        for (int xx=cs3.length-1;xx>=0;xx--) {

            rcs3[aa]=cs3[xx];
            aa++;
//            System.out.println(aa+" "+xx);


//        char [] rcs3 =new char[cs3.length+1];
//        for(int ci =cs3.length-1;ci>=0;ci--){
//            for (int ii =0;ii<=cs3.length;ii++){
//                rcs3[ii]=cs3[ci];
//                System.out.println(ii +"  "+ci);
//
//            }

        }
        System.out.println("------");
//        for (char xx :rcs3){
//            System.out.println(xx);
//        }
        System.out.println(String.valueOf(rcs3));

    }
}
