package test1202.test;


/*
* final 关键字在java中被称为完结器
* final 能声明 类  方法  和 属性   加了final  声明的类不能被继承
* 声明的方法不能被重写
* 声明的变量为常量， 常量无法修改。
* * */
class People{ // 如果这里变成 final class People{ 那么 下面的 Student类就无法通过编译了
    People(){}
    People(int a){System.out.println("adidas");}
    final void say(){
        System.out.println("this is a test");

    }
}


class Student extends People{
    //void say(){  //上面 final void say（）加了final  所以这里不能重写

    }


public class test1 {
    public static void main(String[]args){
        People p = new People(1);
        p.say();

        final String AA = "qqq"; //这里 常量的 命名一般约定为大写
        //aa = "fff";  这里  aa 加了final 为常量 不能再把aa变成 fff
        System.out.println(AA);
    }
}
