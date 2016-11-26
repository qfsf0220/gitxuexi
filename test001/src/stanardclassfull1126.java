/**
 * Created by qfsf on 2016/11/26.
 一个标准class的最终版本
 学生类：
    成员变量：
        name  age
    构造方法：
        无参，带两个参数
    成员方法：
        getXxx()/ setXxx()
        show() 输出该类的所有变量值
    给成员变量赋值：
        A setxxx()   常用
        B 构造方法

    输出成员变量值：
        A 通过 getXX（）分别获取 然后拼接  常用
        B   通过调用show（） 方法

 */
class stanardclassfull{
    private String name;
    private int age;
    //构造方法
    public  stanardclassfull(){}

    public stanardclassfull(String name,int age){
        this.name=name;
        this.age= age;   //这两个都是通过构造方法进行赋值，上面的 setxxx（）方法也是赋值。setxx方法是单一赋值，更灵活一些。
    }

    public String getName(){ return name;}

    public void setName(String name){ this.name=name;}

    public int getAge(){return age;}

    public void setAge(int age){this.age = age;}

    //show() 输出所有的成员变量
    public void show(){
        System.out.println(name+"--"+age);
    }
}


public class stanardclassfull1126 {
    public static void main (String[]args){
        //方式1 给成员变量赋值   （无参构造 + setxxx()）
        //无参构造方法来创建对象 然后通过setxxx 赋值
        stanardclassfull s1= new stanardclassfull();
        s1.setName("qf");
        s1.setAge(28);
        //输出
        System.out.println(s1.getName()+"---"+s1.getAge());
        s1.show();

        //方式2
        stanardclassfull s2 = new stanardclassfull("sf",27);
        System.out.println(s2.getName()+"---"+s2.getAge());
        s2.show();


    }
}
