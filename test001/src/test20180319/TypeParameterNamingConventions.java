package test20180319;

import javafx.print.PageOrientation;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/3/20.
 */
public class TypeParameterNamingConventions {
    public static void main(String[] args) {
        Mybox<Integer, String> box = new Mybox<>();
        box.add(199, "Hello");
        System.out.println(box.getT()+"~~"+box.getS());
        System.out.println("-------");
        Pair<String,Integer> pair =new Pair<String,Integer>();
        pair.addKeyValue("1aa",122);
        System.out.println(pair.getValue("1aa"));
        System.out.println("--------");

        CustomList<Mybox> list = new CustomList<>();
        list.addItem(box);
        System.out.println(list.getItem(0).getT());
        System.out.println(list.getItem(0).getS());

    }
}

class Mybox<T,S>{
    private T t;
    private S s;
    public void add(T t ,S s){
        this.t = t;
        this.s = s;
    }
    public T getT() {
        return t;
    }
    public S getS() {
        return s;
    }
}


class Pair<K,V>{
    private Map<K, V> map = new HashMap<K, V>();
    public void addKeyValue(K key,V value){
        map.put(key, value);
    }
    public V getValue(K key) {
        return map.get(key);
    }
}

class CustomList<E>{
    private List<E> list = new ArrayList<>();
    public void addItem(E value){
        list.add(value);
    }
    public E getItem(int index) {
        return list.get(index);
    }
}