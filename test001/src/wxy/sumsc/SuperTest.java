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