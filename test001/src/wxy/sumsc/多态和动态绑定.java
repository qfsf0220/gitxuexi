package wxy.sumsc;

/**
 * Created by Administrator on 2017/8/9.
 */
public class 多态和动态绑定 {
    public static void main(String []args){
        Dongwu dw = new Dongwu();
        dw.say();
        dw = new Mao();
        dw.say();
        dw=new Gou();//父类变量可以引用父类的实例 ，也可以引用子类的实例。
        dw.say();

        Mao mm = new Mao();
        mm.say();
        //mm = new Gou();//子类变量无法引用 。。
        //多态存在的三个必要条件：要有继承、要有重写、父类变量引用子类对象。

        teacher tt = new teacher();
        tt.teach(new sf(),new python());
        tt.teach(new student(),new learn());
    }
}

class Dongwu{
    public void say(){
        System.out.println("11111");
    }
}

class Mao extends Dongwu{
    public void say(){
        System.out.println("mmm");
    }
}

class Gou extends Dongwu{
    public void say(){
        System.out.println("www");
    }
}

class learn{
    public  String learn(){
        return "知识";
    }
}
class java extends learn{
    public String learn(){
        return "learn java";
    }
}
class python extends learn{
    public String learn(){
        return  "learn python";
    }
}


class student {
    public void xuexi(learn lll){
        System.out.println("i am a student,i am learning "+lll.learn());
    }
}
class qf extends student{
    public void xuexi(learn lll){
        System.out.println("i'm qf ,i am learning "+lll.learn());
    }
}


class sf extends student{
    public void xuexi(learn lll){
        System.out.println("i'am sf ,i am learning "+lll.learn());
    }
}


class teacher{
    public void teach(student s , learn l){
        s.xuexi(l);
    }
}
