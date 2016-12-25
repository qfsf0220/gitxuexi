package test1225.neibulei;

/**Minty_53028   mintystudio.com:18001  Minty_53028
 * Created by qfsf on 2016/12/25.
 */
public class neibulei_demo {
    public static void main(String[] args) {
        Person person = new Person();
        person.start();
    }

    static class Person{
        Car car ;//这里直接声明一个内部类 Car 的对象 为car

        Person(){
            car = new Car();
        }//这个构造方法 直接初始化 Car 类 分配内存

        //再用start方法调用 car的方法
        void start (){
            car.playcar();
        }



        int age= 10;
        void eat(){
            System.out.println("i am eating..");
        }
        //这里添加一个内部类
        class Car{
            void playcar(){
                System.out.println("play car");
                System.out.println("Person age"+age);//内部类 外部类 都可能互用、
                eat(); //互用、内部类使用外部类eat方法
            }
        }




    }
}


