package KFjava.test20170505;

/**
 * Created by Administrator on 2017/5/5.
 */
public class Ostrich extends Bird{
    public void fly(){
        System.out.println("鸵鸟");
    }

    public static  void main(String []args){
        Ostrich o = new Ostrich();
        o.fly();
        System.out.println("\n" +
                "方法的重写”两同  两小  一大“"+
        "\n 两同 方法名相同，形参列表相同"+" \n 两小 子类方法返回值类型比弗雷返回值类型 更小 或者相等，子类方法抛出的异常类比父类方法声明抛出的异常小或者相等"+
        "\n 一大  子类方法的访问权限应该比父类方法的访问权限更大或者相等。"+
        "\n 覆盖方法个被覆盖方法要么都是类方法 要么都是实例方法，不能分开来。");
    }

}
