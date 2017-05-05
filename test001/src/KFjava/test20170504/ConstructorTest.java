package KFjava.test20170504;

import wxy.test1212_usebaozhuanglei.StringToInt;

/**
 * Created by Administrator on 2017/5/5.
 */
public class ConstructorTest {
    public String name ;
    public int age;
    //如果没有主动添加一个构造器，系统会自动提供一个没有参数的构造器，
    //这个构造器的执行体为空，不做任何事情。
    public ConstructorTest(String name ,int age){//这里是一个自定义的构造器，传入两个参数
        this.name = name ;//this代表他初始化的对象。
        this.age = age;
    }

    public  static void main(String []args){
        ConstructorTest ct = new ConstructorTest("qf",123);
        System.out.println(ct.name);
        System.out.println(ct.age);
    }

}
