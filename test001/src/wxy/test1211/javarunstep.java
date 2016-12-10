package wxy.test1211;

/**
 下面的类来说明一个基本的 Java 类的运行顺序

 先运行到第 9 行，这是程序的入口。
 然后运行到第 10 行，这里要 new javarunstep，就要调用 javarunstep 的构造方法。
 就运行到第 5 行，注意：可能很多人觉得接下来就应该运行第 6 行了，错！初始化一个类，必须先初始化它的属性。
 因此运行到第 2 行，然后是第 3 行。
 属性初始化完过后，才回到构造方法，执行里面的代码，也就是第 6 行、第 7 行。
 然后是第8行，表示 new javarunstep。
 然后回到 main 方法中执行第 11 行。
 然后是第 12 行，main方法执行完毕。

 */

public class javarunstep {   //1
    private String name;       //2
    private int age;        //3
                            //4
    public void javarunstep(){//5
        name = "qf";            //6
        age = 3;                //7
    }                           //8
    public static void main(String[] args) {      //9
        javarunstep obj = new javarunstep();        //10
        System.out.println(obj.name + "的年龄是" + obj.age);    //11
    }           //12
}               //13
