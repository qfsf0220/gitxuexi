package yibai;

/**
 * Created by Administrator on 2017/9/12.
 */
public class GenericT4 {
    public static void main(String[] args) {
        Box5<Integer> box5 = new Box5<>();
        box5.set(Integer.valueOf(105));
        System.out.println(box5.get());
        Box5 b5 = new Box5();
        b5=box5;
        System.out.println(b5.get());

        b5.set(106);
        System.out.println(b5.get());
        b5 =box5;
        System.out.println(b5.get());

    }
}

class Box5<T>{
    private T t;
    public  void set(T t){
        this.t =t ;
    }

    public T get (){
        return t;
    }
}
