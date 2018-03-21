package test20180319;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Administrator on 2018/3/21.
 */
public class GenericsSet {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("aa");
        stringSet.add("bb");
        stringSet.add("aa");
        stringSet.add("python");

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(Integer.valueOf(102));
        integerSet.add(Integer.valueOf(103));

        Iterator<String> stringIterator = stringSet.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }

    }
}
