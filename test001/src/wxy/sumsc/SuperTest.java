package wxy.sumsc;

/**
 super 关键字的功能：
 调用父类中声明为 private 的变量。
 点取已经覆盖了的方法。
 作为方法名表示父类构造方法。
 */
public class SuperTest {
    public static void main(String []argf){
        Dog d = new Dog();
        d.move();


        Dog2 d2 = new Dog2(6,"沙沙");
        d2.say();
    }
}

class Anim{
    private String abc="abcdefghi";

    public String getAbc() {
        return abc;
    }
    public void move(){
        System.out.println("animal can move");
    }
}

class Dog extends Anim{
    public  void move(){
        super.move();
        System.out.println(super.getAbc());
    }
}

class Animal2{
    String name;
    public Animal2(String name){
        this.name = name;
    }
}

class Dog2 extends Animal2{
    int age;
    public Dog2(int age,String name){
        super(name);
        this.age    =age;

    }
    public  void say(){
        System.out.println( name+" "+age+"岁了");
    }


}