package yibai;


/**
 * Created by Administrator on 2017/9/12.
 */
public class GenericsClass {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.set(new Integer(199));
        stringBox.set(new String("hi"));

        System.out.println(integerBox.get());
        System.out.println(stringBox.get());

    }
}

class Box<T>{
    T t;
    public void set(T t){
        this.t =t;
    }
    public T get(){
        return t;
    }
}
