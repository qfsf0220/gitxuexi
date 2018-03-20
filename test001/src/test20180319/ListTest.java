package test20180319;

import org.apache.logging.log4j.core.tools.picocli.CommandLine;

import java.util.*;

/**
 * Created by Administrator on 2018/3/19.
 */
public class ListTest<T> {
    int[] a = {1, 2, 3, 5};
    int[] b = new int[5];
//    private T t;

    List<Integer> l1 = new ArrayList<>();

    void addadd(){
        for (int i=0;i<5;i++) {
            l1.add(i);
        }
    }



    void printlist() {
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
    }

    void printlist2(){
        for(int i :l1) {
            System.out.println(i);
        }
    }

    void printlist3(){
        Integer[] intarray = new Integer[l1.size()]; //生成一个数组列表对象
//        System.out.println(l1.size());
        l1.toArray(intarray);   //把List 转为 array
        for (int i:intarray){  //遍历
            System.out.println(i);
        }
//        l1.toArray(strarray);
//        System.out.println(l1);
//        for (int i=0;i<l1.size();i++){
//            System.out.println(strarray[i]);
        }


    void printlist4(){
        Iterator<Integer> ii = l1.iterator();
        while (ii.hasNext()){
            System.out.println(ii.next());
        }
    }

    public static void main(String[] args) {
        ListTest lt = new ListTest();
        lt.addadd();
        lt.printlist();
        System.out.println("\n");
        lt.printlist2();
        System.out.println("\n");
        lt.printlist3();
        System.out.println("\n...");
        lt.printlist4();
        System.out.println("\n");
    }
}
