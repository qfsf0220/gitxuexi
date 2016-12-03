package test1203;

/**
 * Created by qfsf on 2016/12/3.
 */

class Person{
    String name;
    int age;

    public  void tell(){
        System.out.println("name:"+name+" age:"+age);
    }
}

public class classwithobject {
    public static void main(String[] args) {
        Person p = new Person();
        p.name="qf";
        p.age=27;
        p.tell();
    }
}
