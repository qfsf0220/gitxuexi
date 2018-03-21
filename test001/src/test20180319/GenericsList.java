package test20180319;

import jodd.madvoc.config.ScopeData;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2018/3/21.
 */
public class GenericsList {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(Integer.valueOf(101));
        integerList.add(Integer.valueOf(222));

        List<String> stringList = new ArrayList<>();
        stringList.add(String.valueOf("1asd"));
        stringList.add(String.valueOf("A32423d"));
        stringList.add(String.valueOf("java"));

        System.out.println(integerList.get(0));
        System.out.println(stringList.get(2));

        for (int i : integerList){
            System.out.println(i);
        }

        for (String i :stringList){
            System.out.println(i);
        }

        Iterator<String> stringIterator = stringList.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }




    }
}
