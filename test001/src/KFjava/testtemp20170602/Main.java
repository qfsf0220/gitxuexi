package KFjava.testtemp20170602;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.jws.Oneway;
import java.util.Objects;
import java.lang.String;

/**
 * Created by Administrator on 2017/6/2.
 */

public class Main {
    public static void main(String[] args) {
        Main a = new Main() {
            public boolean equals(Object obj) {
                return true;
            }
        };
        Main b = a;
        Main c = new Main() {
            public boolean equals(Object obj) {
                return false;
            }
        };

        boolean b1;
        boolean b2;
        boolean b3;
        b1 = a == b;
        b2 = b.equals(b + "!");
        b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
        addString("##",20);
    }
    static void  addString(String a,int b){
        String atmp="";
        for(int i =0;i<b;i++){
            atmp+=a;
        }
        System.out.println( atmp);
    }

}
//public class Main {
//            public static void main(String[] args) {
//                String a = "Wow!";
//                String b = new String("Wow!");
//                String c = a;
//                String d = c;
//
//                boolean b1 = a == b;
//                boolean b2 = b.equals(b + "!");
//                boolean b3 = !c.equals(a);
//
//                if (b2) {
//                    System.out.println("Success!");
//                }
//            }
//        }