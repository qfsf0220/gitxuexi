package yibai.GenericTest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/18.
 */
public class GenericTest001 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        Box<Integer> integerBox = new Box<>();
        Box<Character> characterBox = new Box<>();

        characterBox.add('X');
        integerBox.add(11);
        stringBox.add("qae");
        System.out.println(characterBox.get());
        System.out.println(integerBox.get());
        System.out.println(stringBox.get());

        Box2<String,Integer> box2 = new Box2<>();
        box2.add("ad",22);
        box2.getmsg();
        System.out.println(box2.getA());

        P<String,String> pp = new P<>();
        pp.addkey("123","qqq");
        System.out.println(pp.getvalue("123"));

    }


}

class Box<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}

class Box2<A,B>{
    private A a;
    private B b;

    public void add(A a,B b){
        this.a=a;
        this.b=b;
    }
    public  A getA(){
        return a;
    }
    public B getB(){
        return b;
    }

    public void getmsg(){
        System.out.println(a+" - "+b);
    }
}

class P<A,B>{
    private Map<A, B> map = new HashMap<>();
    public void addkey(A key, B value){
        map.put(key, value);
    }
    public  B getvalue(A key){
        return map.get(key);
    }
}