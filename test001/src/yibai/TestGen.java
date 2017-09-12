package yibai;

import java.util.Hashtable;

/**
 * Created by Administrator on 2017/9/12.
 */
public class TestGen {

}


class gen0<K,V>{
    Hashtable<K,V> h = new Hashtable<K, V>();
    public  void put(K k,V v){
        h.put(k,v);
    }
    public V get(K k){
        return  h.get(k);
    }

}