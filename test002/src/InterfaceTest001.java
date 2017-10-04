import sun.awt.PeerEvent;

/**
 * Created by qfsf on 2017/10/5.
 */
public class InterfaceTest001 {
    public static void main(String[] args) {
        Person p  = new Person();
        p.walk();
        Dog d = new Dog();
        d.walk();
    }
}

interface  Walkable{
    void walk();
}

class Person implements Walkable{
    public Person(){}

    public void walk(){
        System.out.println("person walk");
    }

}

class Dog implements Walkable{

    @Override
    public void walk() {
        System.out.println("dog walk");
    }
}