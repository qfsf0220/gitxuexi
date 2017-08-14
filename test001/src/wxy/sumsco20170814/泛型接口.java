package wxy.sumsco20170814;

/**
 * Created by Administrator on 2017/8/14.
 */
public class 泛型接口 {
    public static  void main(String[]a){
        Info<String > i = new Infoshixian<>("qqqqffff");
        System.out.println(i.getVar().length());
    }
}

//定义泛型接口
interface Info<T>{
    public T getVar();
}
//实现接口
class Infoshixian<T> implements Info<T>{
    private T var ;
    public Infoshixian(T var){
        this.setVar(var);
    }

    public void setVar(T var) {
        this.var = var;
    }

    public T getVar() {
        return var;
    }

}