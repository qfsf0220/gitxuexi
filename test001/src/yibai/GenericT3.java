package yibai;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/9/12.
 */
public class GenericT3 {
    public static void main(String[] args) {
        Box4<Integer,List<String>> box4 = new Box4<>();
        List<String> messages = new ArrayList<>();
        messages.add("a");
        messages.add("b");
        messages.add("c");
        System.out.println(messages.get(0));

        box4.add(111,messages);
        System.out.println(box4.getS());
        System.out.println(box4.getT());

    }
}

class Box4<T,S>{
    private T t;
    private S s;

    public void add(T t,S s) {
        this.s = s;
        this.t = t;
    }
    public  T getT(){
        return  t;
    }
    public S getS(){
        return  s;
    }
}
