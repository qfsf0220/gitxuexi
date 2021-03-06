package test1226;

import org.omg.CORBA.PERSIST_STORE;

/**
 * Created by qfsf on 2016/12/26.
 匿名类  与子类有关的匿名类
        与接口有关的匿名类
 */
public class niminglei {
    public static void main(String[] args) {
        Person per = new Boy();
        Test ttt = new Test();
            ttt.testPerson(per);
        per =new Girl();
            ttt.testPerson(per); //这里是 在抽象类中创建 匿名类

        ttt.testCar(new Car(){});//这里就是在一般类中创建 匿名类  这个new Car(){} 就是Car类的子类的匿名类 {}空说明什么都没做
//直接继承了父类的方法sound
        ttt.testCar(new Car(){
            @Override
            void sound() {
                System.out.println("chelaileya");//这里重写了sound的方法。覆盖了前面的syso didi
            }
        });

        Ball ball = new redBall();
        ttt.testBall(ball);
        ball = new blueBall();
        ttt.testBall(ball);

        ttt.testBall(new redBall(){
            @Override
            public void ballColor() {
                System.out.println("this is a pink ball");
            }
        });

        ttt.testBall(new Ball() {
            @Override
            public void ballColor() {
                System.out.println(" 这里必须重写接口ball的  ballColor方法。。自动让你重写了。。");
            }
        });

    }
}

abstract class Person{
    abstract void speak();
}

class Boy extends Person{
    @Override
    void speak() {
        System.out.println("i am  boy");
    }
}

class Girl extends Person{
    @Override
    void speak() {
        System.out.println("i am girl");
    }
}

class Test{
    void testPerson(Person perso) {
        perso.speak();
    }
    void testCar(Car car){
        car.sound();
    }


    void testBall(Ball ball){
        ball.ballColor();
    }

}

class Car {
    void sound(){
        System.out.println("didi");
    }
}

interface Ball{
    void ballColor();
}

class redBall implements Ball{
    @Override
    public void ballColor() {
        System.out.println("red ball");
    }
}


class blueBall implements Ball{
    @Override
    public void ballColor() {
        System.out.println("blue ball");
    }
}