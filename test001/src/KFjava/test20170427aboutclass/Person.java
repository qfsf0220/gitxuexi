package KFjava.test20170427aboutclass;

/**
 * Created by Administrator on 2017/4/27.
 */
public class Person {
    public String name;
    public int age;
    public void say(String content){
        System.out.println(content);
    }


public static void main(String [] args){
        Person p=new Person();
        Person p2 = p; //这里p2变量只想堆内存中同一个Person对象
        p.name="qf";
        p.age=27;
        p.say("learn java.");

    System.out.println("hello "+p.name+'.');
    System.out.println("----------------");



    }
}