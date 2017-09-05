package LYlesson.statictest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by Administrator on 2017/9/4.
 */
public class statictest {
    String name;
    int age;
    String company;
    static String job;
    public statictest(){
    }
    public  statictest(String name,int age,String company){
        this.name=name;
        this.age=age;
        this.company = company;

    }
    public statictest(String name,int age,String company,String job){
        this.age=age;
        this.name   =name   ;
        this.company= company;
        this.job= job;
    }
    public void printinfo(){
        System.out.printf("老总名字：%s\n老总年龄：%s\n老总的公司：%s\n老总的职位：%s\n",name,age,company,job);
    }

}

class printprint{
    public static void main(String[] args) {
        LocalDate ld =  LocalDate.now();
        System.out.println(ld);
        System.out.println(LocalDateTime.now());


        statictest st1 = new statictest("张总",31,"森浦","运维");
        st1.printinfo();
        System.out.println("--------");
        statictest st2 = new statictest("杨总",31,"中汇亿达");
        st2.printinfo();
        System.out.println("--------");
        statictest st3 = new statictest("小伙子",25,"世纪天成");
        st3.printinfo();
        System.out.println("--------");
        statictest st4 = new statictest("金元",25,"梅陇文化馆","放映");
        st4.printinfo();System.out.println("--------");
        statictest st5 = new statictest("丹哥",30,"世纪天成");
        st5.printinfo();System.out.println("--------");
    }
}