package test170926;

import test1220.demo1.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/9/27.
 */
public class ListTest {
    public static void main(String[] args) {
        int[] myarray = {123, 324, 345, 34, 435, 54, 2, 23, 213};


        Arrays.sort(myarray);
        printArray("zhege是测试",myarray);

        int[] destination = new int[myarray.length + 1];
        System.arraycopy(myarray,0,destination,1,3);
        destination[3]=11111;
        System.arraycopy(myarray,0,destination,0+1,3-1);
        for (int i :destination){
            System.out.println(i);
        }

        String [] lista = {"a", "b", "c"};
//        int [] lista = {1,2,3};
        String[] listb = {"e", "f", "g"};
        List list = new ArrayList(Arrays.asList(lista));
        list.addAll(Arrays.asList(listb));
        Object[] c = list.toArray();
        System.out.println(
                Arrays.toString(c)
        );





    }

    static void printArray(String message,int []array){
        System.out.println("Message:"+message+"， 总共 "+array.length+" 个元素,排序后为：");
        for(int i =0;i<array.length;i++){
            if (i!=0)
            System.out.print(",");
            System.out.print(array[i]);
        }

    }

}

