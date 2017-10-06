/**
 * Created by qfsf on 2017/10/6.
 */
public class JiChengTest003 {
    public static void main(String[] args) {
        MySub ms = new MySub();
        ms.printinfo();


        Sanjiaoxing sjx = new Sanjiaoxing(1.1,2.2);
        sjx.printmsg();
        System.out.println("area is :"+sjx.getArea());

    }
}


class MySuper {
    int a =111;
    String b = "abc";
}

class MySub extends MySuper{
    private int a = 222;
    public String  b = "xxx";

    public  void printinfo(){
        System.out.println("a:"+a);
        System.out.println("super a:"+super.a);
        System.out.println("b:"+b);
        System.out.println("super b:"+super.b);

    }
}

abstract  class SS{
    private String name;
    SS(){this.name ="unknown name";}
    SS(String name ){
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    abstract void printmsg();

    abstract double getArea();
}

class Sanjiaoxing extends SS{
    private double width;
    private double height;
    Sanjiaoxing(double width,double height){
        super("sjx");
        this.width=width;
        this.height=height;
    }
    void printmsg(){
        System.out.println("this is a sjx");

    }
    double getArea(){
        return     width * height;
    }
    //这里 三角形这个子类 需要实现所有父类的抽象方法


}

