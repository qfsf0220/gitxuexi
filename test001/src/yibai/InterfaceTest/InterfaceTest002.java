package yibai.InterfaceTest;

/**
 * Created by Administrator on 2017/10/9.
 */
public class InterfaceTest002 {
    public static void main(String[] args) {
        System.out.println(Choices.NO);
        System.out.println(Choices.YES);
    }
}
//
//interface  InterfaceTest002{}
//if (x instanceof Ren){
//
//        }
interface Choices{
    public static final int YES =0;
    //Interface 默认的字段声明都是 public static final 所以可以不用加
    int NO =1;
}

interface Player{
    public abstract void play();
    //接口中方法默认是 public abstract
    void stop();

    boolean forward(double amount);

    double rewind();
}