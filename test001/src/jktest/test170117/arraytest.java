package jktest.test170117;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * @author feng.qian
 * @create at 2017-01-17 12:18
 */


public class arraytest {
    public static void main(String[] args) {
        //静态初始化
        int intArrat[] = {1234,123,2,1};
        Integer dateArray[] = {123,123,2,123,22};
        String strArray[] = {"","123","321","123.5"} ;
        //动态初始化
        int qf [][] = new int[2][3];
//        qf[1]= new int[]{123, 22};
//        qf[2]= new int []{22,33};
        qf[0] = new int[2];
        qf[1] = new int[2];
        System.out.println(qf[0][1]);;
        System.out.println("================");

        String qfstr [] = new String[3];//复合类型1
        Integer qfint []= new Integer[10];
        for(int i=0;i<=5;i++){
            qfint[i]= i;
        }

        qfstr[0]= "nong";
        qfstr[1]="hao";
        qfstr[2]= "boss";
        // OUt of Bound ... qfstr[3]=new String ("!");
        for (String a:qfstr){
            System.out.println(a);
        }
        System.out.println("-----------");
        for (int b :qfint){
            System.out.println(b);
        }


    }
}
