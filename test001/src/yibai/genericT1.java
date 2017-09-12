package yibai;

/**
 * Created by Administrator on 2017/9/12.
 */
public class genericT1 {
    public static void main(String[] args) {
        Box1<Integer> ib = new Box1<>();
        Box1<String> ib2 = new Box1<>();
        ib.printmsg(123);
        ib.printmsg(432);
        ib2.printmsg("小伙子");
        Box2<Integer,String,Double,Character>  box2= new Box2<>();
        box2.printmsg(1,"abc",5.5,'Q');
    }
}
/*
按照约定，类型参数名称命名为单个大写字母，以便可以在使用普通类或接口名称时能够容易地区分类型参数。以下是常用的类型参数名称列表 -

        E - 元素，主要由Java集合(Collections)框架使用。
        K - 键，主要用于表示映射中的键的参数类型。
        V - 值，主要用于表示映射中的值的参数类型。
        N - 数字，主要用于表示数字。
        T - 类型，主要用于表示第一类通用型参数。
        S - 类型，主要用于表示第二类通用类型参数。
        U - 类型，主要用于表示第三类通用类型参数。
        V - 类型，主要用于表示第四个通用类型参数。*/
class Box1<T>{
    T t;

    void printmsg(T t){
        this.t=t;
        System.out.println(t);
    }
}
class Box2<T,S,U,V>{
    T t;
    S s;
    U u;
    V v;
    void printmsg(T t,S s,U u,V v){
        this.t =t;
        this.s =s;
        this.u =u;
        this.v =v;
        System.out.println(""+t+s+u+v);
    }
}