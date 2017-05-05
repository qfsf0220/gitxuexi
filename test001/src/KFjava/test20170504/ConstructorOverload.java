package KFjava.test20170504;

/**
 * Created by Administrator on 2017/5/5.
 */
public class ConstructorOverload {
    public String name;
    public int age;
    public ConstructorOverload(){
    }
    public ConstructorOverload(String name){
        this.name = name;
//        System.out.println(this.name);
    }

    public ConstructorOverload(String name,int age){
        this.name = name;
        this.age = age;

    }
    public static void main(String[]agrs){
        ConstructorOverload co = new ConstructorOverload("qfsf");
        System.out.println(co.name+" "+co.age);
        ConstructorOverload co2 = new ConstructorOverload("mm",99);
        System.out.println(co2.name+" "+co2.age);
    }
}
