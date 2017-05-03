package KFjava.test20170428;

import KFjava.test20170427aboutclass.Person;

/**
 * Created by Administrator on 2017/5/2.
 */

class Persons { //这里的 a b inta  都是成员变量。
    //成员变量是指 在类里面定义的变量。
    public String a,b;    //实例变量
    public static int inta ;  //static修饰  类变量
    public void  test(){
        System.out.println("this is a test.");
    }
}

public class PersonTest {

    public static void main(String[]args){
        Persons p = new Persons();
        System.out.println(p.a+"  "+p.b+"  "+p.inta);
        p.b="塑料";
        p.inta=123;
        System.out.println(p.a+"  "+p.b+"  "+p.inta);
        System.out.println(Persons.inta);
        Persons p2 = new Persons();
        System.out.println(p2.inta);



        p.test();


    }
}
