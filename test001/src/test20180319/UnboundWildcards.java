package test20180319;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by Administrator on 2018/3/22.
 */
public class UnboundWildcards {
    public static  void printAll(List<?> list){
        for (Object i :list){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("123", "asd", "d");
        printAll(list);
        System.out.println("----");


        int[] intArray = new int[5];
        intArray[0] = 213;

        Integer[] intArray2 = {2344, 5546, 213};
        Integer[] intArray3 = new Integer[5];
        intArray3[0] = 333;
        System.out.println("--"+intArray3[0]+"--");

        List<Integer> list4 =Arrays.asList(intArray2);
        printAll(list4);

        List list2 = Arrays.asList(intArray2);
        printAll(list2);
        List<Integer> list3 = Arrays.asList(123, 123, 44);
        printAll(list3);
    }

}
