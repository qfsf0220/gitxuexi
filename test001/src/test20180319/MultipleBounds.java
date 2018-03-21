package test20180319;

/**
 * Created by Administrator on 2018/3/21.
 */
public class MultipleBounds {
    public static void main(String[] args) {
        maximum(4, 6, 2);
        maximum(5.43, 3.2, 2.0);
    }
    public static <T extends  Number & Comparable<T> > T maximum (T x, T y, T z){
        //T是传递给泛型类的类型参数应该是Number类的子类型，并且必须包含Comparable接口。 如果一个类作为绑定传递，它应该在接口之前先传递，否则编译时会发生错误。
        T max = x;
        if (y.compareTo(max)> 0){
            max = y;
        }if (z.compareTo(max)>0){
            max = z;
        }
        return max;
    }

}
