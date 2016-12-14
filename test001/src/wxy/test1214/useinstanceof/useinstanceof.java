package wxy.test1214.useinstanceof;

import java.util.Objects;

/**
 * 多态性带来了一个问题，就是如何判断一个变量所实际引用的对象的类型 。Java 使用 instanceof 操作符。
 *
 * @author feng.qian
 * @create at 2016-12-14 14:29
 *
 * instanceof 运算符用来判断一个变量所引用的对象的实际类型，注意是它引用的对象的类型，不是变量的类型。
 */


public class useinstanceof {
    public static void main(String[] args) {
        People p = new People();  //  // 引用 People 类的实例
        if(p instanceof Object){
            System.out.println("这是一个对象");
        }
        if(p instanceof People){
            System.out.println("这是一个人类");
        }
        if (p instanceof Teacher){
            System.out.println("这是一个老师");
        }
        if( p instanceof Xiaozhang){
            System.out.println("这是一个校长");
        }
        System.out.println("----------------------");
        //应用Teacher 类的实例
        p = new Teacher();
        if(p instanceof Object){
            System.out.println("这是一个对象");
        }
        if(p instanceof People){
            System.out.println("这是一个人类");
        }
        if (p instanceof Teacher){
            System.out.println("这是一个老师");
        }
        if( p instanceof Xiaozhang){
            System.out.println("这是一个校长");
        }
        // 可以看出，如果变量引用的是当前类或它的子类的实例，instanceof 返回 true，否则返回 false。
    }
}

class  People{}
class Teacher extends  People{}
class Xiaozhang extends Teacher{}