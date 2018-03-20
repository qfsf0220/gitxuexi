package test20180319;

/**
 * Created by Administrator on 2018/3/20.
 */
public class RawTypes {
    public static void main(String[] args) {
        Box5<Integer> box = new Box5<>();
        box.set(11);
        System.out.println(box.getT());

        Box5 rawBox = new Box5();
        rawBox = box;
        System.out.println(rawBox.getT());

        rawBox.set(12);
        System.out.println(rawBox.getT());
    }
}

class Box5<T>{
    private T t;
    public void set(T t){
        this.t = t;}
    public T getT(){
        return t;
    }
}