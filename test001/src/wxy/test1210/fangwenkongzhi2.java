package wxy.test1210;

/**
 * Created by qfsf on 2016/12/10.
 *

 父类中声明为public的方法在子类中也必须为public。

 父类中声明为protected的方法在子类中要么声明为protected，要么声明为public。不能声明为private。

 父类中默认修饰符声明的方法，能够在子类中声明为private。

 父类中声明为private的方法，不能够被继承。
 */
class Dog2{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    void show(){
        System.out.println("name:"+getName()+" age:"+getAge());
    }
}


class fangwenkongzhi2 {
    public static void main(String[] args) {
        Dog2    d = new Dog2();
        d.setAge(6);
        d.setName("shasha");
        d.show();
    }
}
