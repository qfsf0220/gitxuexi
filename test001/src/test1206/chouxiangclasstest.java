package test1206;

/**
 * 面向对象抽象类的应用
 *
 *好处许多对象不用重复调用
 *
 * @author feng.qian
 * @create at 2016-12-06 17:01
 */
abstract class Person{
    private int age;
    private String name;

    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    //这里是一个抽象类
    public abstract void want();

}

class Student extends Person{
    private int score;
    public void setScore(int score) {
        this.score = score;
    }
    public int getScore() {
        return score;
    }

    public Student(int age, String name,int score) { //这里是复写父类的构造方法
        super(age,name);
        this.score=score;
    }
    public void want(){
        System.out.println("name "+getName()+" age"+getAge()+" score"+getScore());
    }
}

class  Worker extends Person{
    private int money;
    public void setMoney(int money) {
        this.money = money;
    }
    public int getMoney() {
        return money;
    }
    public Worker(int age,String name,int money){
        super(age,name);
        this.money=money;
    }
    public void want(){
        System.out.println("name "+getName()+" age"+getAge()+" money"+getMoney());
    }

}


public class chouxiangclasstest {
    public static void main(String[] args) {
        Student s = new Student(10,"q",99);
        Worker w = new Worker(20,"f",100);
        s.want(); //注意：不能继承已经完成的类
        w.want();
    }
}
