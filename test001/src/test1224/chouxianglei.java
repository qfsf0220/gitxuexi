package test1224;

/**
 * Created by qfsf on 2016/12/24.
 */
public class chouxianglei {
    public static void main(String[] args) {
        //A a  =new A(); 这里是错误的 不能初始化 一个抽象类，抽象类不能直接调用抽象方法。
    }
}


abstract class A {
     void eat(){
         System.out.println(" i am eat.");
     }//1一个抽象类可以有 正常方法。

     abstract int  getmax();//也可以有抽象方法
}

class B extends A{  //2如果一个非抽象类 这里是B 是摸个抽象类的子类 这里是A，那么他必须重写父类的抽象方法，给出方法体。这里idea会提示你重写
    @Override
    int getmax() {
        return 0;
    }
}
//4如果 这里  class B  也变成 abstract class B extended A 那么 B类  默认继承了A的抽象方法、可以不用重写A的抽象方法。
//5 对于abstract方法只能声明 不能实现 就是A里面不能有{}方法体
//3 abstract 类 可以没有abstract方法。这个是没问题。但是若没有抽象方法  那用抽象类也就没有意义了。直接去掉abstract 用普通类就行了。
