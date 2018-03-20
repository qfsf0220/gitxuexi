package test20180319;

/**
 * Created by Administrator on 2018/3/20.
 */
public class MultipleTypeParameters {
    public static void main(String[] args) {
        Box3<Integer, String> box = new Box3<>();
        box.setTS(5,"s");

        System.out.println(box.getS() + " " + box.getT());
        Box3<Character, Character> box2 = new Box3<>();
        box2.setTS('X','c');

        System.out.println(box2.getS() + " " + box2.getT());
    }
}

class Box3<T, S> {
    private T t;
    private S s;

    void setTS(T t ,S s) {
        this.t = t;
        this.s = s;
    }

    public S getS() {
        return s;
    }

    public T getT() {
        return t;
    }
}