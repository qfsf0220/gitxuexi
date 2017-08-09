package wxy.sumsc;

import java.util.Properties;

/**
 * Created by Administrator on 2017/8/9.
 */
public class JiCheng2 {
    public static void main(String[]args){
        Stu s = new Stu();
        s.skill="java";
        s.age=30;
        s.add="xuhui";
        s.name="qf";
        s.say();
        s.learn();
    }
}

class People{
    String name;
    int age;
    void say(){
        System.out.printf("name:%s,age:%d",name,age);
    }
}

class Stu extends People{
    String add;
    String skill;
    void say(){
        System.out.printf("name:%s,age:%d,address:%s,skill:%s\n",name,age,add,skill);
    }
    void learn(){
        System.out.println("i am learning "+skill);
    }
}