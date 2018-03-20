package test20180319;

/**
 * Created by Administrator on 2018/3/20.
 */
public class TypeInference {
    public static void main(String[] args) {
        //type inference
        Box2<Integer> intBox = new Box2<>(); //java8新特性。编译器根据方法参数自动推断方法类型。
        Box2<String> strBox = new Box2<String>();

        intBox.add(198);
        strBox.add("Str198");

        System.out.println(intBox.get());
        System.out.println(strBox.get());

    }

}
class Box2<T>{
    private T t;
    public void add(T t){
        this.t = t;
    }
    public  T get(){
        return t;
    }
}
