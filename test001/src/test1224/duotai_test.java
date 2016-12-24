package test1224;

/**
 * Created by qfsf on 2016/12/24.
 */
public class duotai_test {
    public static void main(String[] args) {
        Car ccc = new Policecar();//这里等于生成了一个policecar的子类 并且赋值给了父类的对象ccc//上转型对象
        ccc.sound();
        ccc = new Amblance();
        ccc.sound();
        ccc =new Firecar();
        ccc.sound();
        //这里三个都打印了 。他们都是由Car父类生成的 ccc对象实现的

    }
}


class Car{
    void sound(){

    }
}

class Policecar extends Car{
    @Override
    void sound() {
        System.out.println("zhua..");
    }
}

class Amblance extends Car{
    @Override
    void sound() {
        System.out.println("jiu..");
    }
}

class   Firecar extends Car{
    @Override
    void sound() {
        System.out.println("hu..");
    }
}