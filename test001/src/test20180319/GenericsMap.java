package test20180319;

import java.util.*;

/**
 * Created by Administrator on 2018/3/21.
 */
public class GenericsMap {
    public static void main(String[] args) {
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        integerIntegerMap.put(1, 2);
        integerIntegerMap.put(2, 2);
        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("name", "q");
        stringStringMap.put("address", "xh");
        stringStringMap.put("job", "worker");

        System.out.println(stringStringMap.get("name"));
        System.out.println(stringStringMap.get(12));

        Iterator<String> stringIterator = stringStringMap.keySet().iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }

        Iterator<String> stringIterator1 = stringStringMap.values().iterator();
        while (stringIterator1.hasNext()){
            System.out.println(stringIterator1.next());
        }

        for (int i =0;i <stringStringMap.size();i++){
            System.out.println(i);
        }

        Set<Map.Entry<String, String>> set123 = stringStringMap.entrySet();
        for (Map.Entry<String, String> set : set123) {
            System.out.println(set.getKey() +"--"+ set.getValue());
        }

        Set set1 = stringStringMap.keySet();
        for (Object i : set1) {
            System.out.println(i+" --- "+stringStringMap.get(i));
        }

        Collection colltest =  stringStringMap.values();


        Collection<String> list1 = stringStringMap.keySet();
        for (String i : list1) {
            System.out.println(i+stringStringMap.get(i));
        }

        Set set2 = stringStringMap.entrySet();
        for (Object i : set2) {
            Map.Entry entry = (Map.Entry) i;
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
