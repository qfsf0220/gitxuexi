package test20180319;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2018/3/22.
 */
public class UpperBoundWildcards {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, 6, 7, 3);
        System.out.println(sum(integerList));

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.2);
        doubleList.add(1.23);
        doubleList.add(1.254);
        System.out.println(sum(doubleList));

    }

    public static double sum(List<? extends Number> numberList){
        double sum = 0.0;
        for (Number n : numberList) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
