package test1202.chouxiangclass;

/**
 * 抽象类的使用
 * 抽象类就是 包含有一个抽象方法的类  就是抽象类
 * 抽象方法就是 声明 而未被实现的方法  比如 void say();这里没有大括号和方法体，抽象方法必须用abstract关键字 声明
 * 抽象类 被子类继承 如果子类不是抽象类 必须重写抽象类中的 所有  方法。
 * 抽象类不能直接实例化  需要通过其子类进行实例化
 *
 * Created by Administrator on 2016/12/5.
 */

abstract class Abs{
    private  int age;
    public void say(){
        System.out.println("hello");
    }
    //这个是抽象方法
    abstract public void talk2(); //这里声明了抽象方法，所以包含这个方法的类 也需要abstract声明是一个抽象类
    abstract public void haha();

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

}

class Son extends Abs{ //抽象类 被子类继承 如果子类不是抽象类 必须重写抽象类中的 所有  方法。
    public void talk2(){  //这里进行了复写 第一个抽象方法
    }
    public void haha(){ //这里重写 第二个抽象方法  需要重写所有的抽象方法
    }
}


public class chouxiang {
    public static void main(String [] args){
        //Abs a = new Abs(); //这里 抽象类不能直接实例化  需要通过其子类进行实例化 所以无法通过编译
        //调用需要实例化子类来调用
        Son s = new Son();
        s.talk2();//这个是在子类中
        s.say();//这个是在父类中
        //要访问父类的私有属性 也是需要 setxx getxx来访问
        s.setAge(20);
        System.out.println(s.getAge());
    }
}
