package yibai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/12.
 */
public class TypeParameterNamingConventions {
    public static void main(String[] args) {
        Mybox<Integer,String> box = new Mybox<Integer,String>();
        box.set(12345,"QQQ");
        System.out.println(box.get1());
        System.out.println(box.get2());

        System.out.println("---------");

        Pair<String,Integer> p = new Pair<>();
        p.addKeyValue("www",123);
        System.out.println(p.getValue("www"));
        System.out.println(p.getValue("wwww"));

        System.out.println("---------");

        CustomList<Mybox> list = new CustomList<Mybox>();
        list.addItem(box);
        System.out.println(list.getItem(0).get1());
        System.out.println(list.getItem(0).get2());

    }
}

class Mybox<T,S>{
    private T t ;
    private S s ;

    public void set(T t ,S s){
        this.t= t;
        this.s=s;
    }

    public T get1(){
        return  t;
    }
    public  S get2(){
        return s;
    }
}

class Pair<K,V>{
    private Map<K,V> map = new HashMap<K,V>();
    public  void addKeyValue(K key,V value){
        map.put(key,value);
    }
    public V getValue(K key){
        return map.get(key);
    }
}

class CustomList<E>{
    private List<E> list = new ArrayList<E>();
    public  void addItem(E value){
        list.add(value);
    }
    public E getItem(int index){
        return list.get(index);
    }
}
