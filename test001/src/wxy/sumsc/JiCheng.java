package wxy.sumsc;

/**
 * Created by Administrator on 2017/8/8.
 */
public class JiCheng {
    public static void main(String[]a){
        AA aa = new AA();
        aa.say("123",12);

    }
}


class AA{
    String name ="1";
    int age;
    void say(String name,int age){
        this.name=name;  //就近原则 选 形参这个name
        this.age=age;
        System.out.printf(" %s---%d",this.name,age);
    }
}

class BB extends AA{
    String skill;
    boolean haslearn;
    void say(){

    }
}