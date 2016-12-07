package test1207;

/**
 * Created by Administrator on 2016/12/7.
 */
class Info<T>{
    private T a;

    public T getA() {
        return a;
    }
    public void setA(T a) {
        this.a = a;
    }

    @Override //重写getA 方法
    public String toString() {//方便得到a的值
        return this.getA().toString();
    }
}

public class tongpeifutest {
    public  static  void main(String[]args){
        Info<String> x = new Info<>();
        x.setA("nn ghao a ");
        say(x);
    }
    public  static void say(Info<?> xx){//public  static void say(Info<Object> xx)接受所有类型就使用Object 类型不过这里指定了 String 报错，需要用通配符 ?  public  static void say(Info<?> xx)
        System.out.println(xx);
    }

}
