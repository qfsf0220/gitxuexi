package yibai.GenericTest;

import java.util.*;

/**
 * Created by Administrator on 2017/10/19.
 */
public class Maptest001 {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put(1,"zk");
        m1.put(2, "ypq");
        m1.put(3, "xxd");
        m1.put(4, "yy");
        m1.put(6, "qf");

        System.out.println(m1);
        System.out.println(m1.entrySet());
        System.out.println(m1.keySet());
        System.out.println(m1.values());
        for (Object i :m1.entrySet()){
            System.out.printf("%s-",i);
        }
        System.out.println();
        for(Object i :m1.values()){
            System.out.printf(i+" ");
        }
        System.out.println();
        for(Object i :m1.keySet()){
            System.out.printf("(%s) ",m1.get(i));
        }

        System.out.println();

        int a;
        int b;
        while (true){
            int a1 = new Random().nextInt(10);
            int b1 = new Random().nextInt(10);
            if (a1+b1<=10){
                a=a1;
                b=b1;

            }else continue;
            break;

        }
        System.out.println("a:"+a +" "+"b:"+b);

    }


}
