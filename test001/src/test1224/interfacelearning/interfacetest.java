package test1224.interfacelearning;

/**
 * Created by qfsf on 2016/12/24.

接口体中只有常量  和方法定义（没有方法体）。接口体中只有抽象方法，没有普通方法，访问权限只能是public
 所以 允许省略 public final 修饰符 所有抽象方法的访问权限一定都是public 允许省略 public abstract
 */
public interface interfacetest {
    public final  int  A = 100;//在接口中 等价于 int a=100;
    public abstract void aaa();//等价于  void aaa();
    public abstract float getSum(float a ,float b);


}

interface  if2{
    int getsum(int a);
}
//类通过关键字 implements 声明自己实现一个或者多个接口，如果实现多个接口，则用逗号隔开。
class  A implements interfacetest,if2{  //这个是class A 实现了 interfacetest 和 if2接口
    //这里A类继承了这两个接口 必须重写 每个接口的 所有方法
    @Override
    public float getSum(float a, float b) {
        return 0;
    }

    @Override
    public void aaa() {

    }

    @Override
    public int getsum(int a) {
        return 0;
    }
}

class B extends xx implements interfacetest,if2{ //这里 是又有继承，又有实现
//class B 继承与xx 又实现了 interfactest if2 ，比较复杂
    @Override
    public float getSum(float a, float b) {
        return 0;
    }

    @Override
    public void aaa() {
    }

    @Override
    public int getsum(int a) {
        return 0;
    }
}

class xx{

}
