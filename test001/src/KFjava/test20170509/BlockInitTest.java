package KFjava.test20170509;

/**
 * Created by Administrator on 2017/5/9.
 */

class Root{
    static {
        System.out.println("root的静态初始化块");
    }
    {
        System.out.println("root的普通初始化块");
    }
    public Root(){
        System.out.println("root的无参数的构造器");
    }
}

class Mid extends Root {
    static {
        System.out.println("Mid的静态初始化块");
    }

    {
        System.out.println("Mid的普通初始化块");
    }

    public Mid() {
        System.out.println("Mid的无参数的构造器");
    }

    public Mid(String abc) {
        this();
        System.out.println("Mid带参数的构造器" + abc);
    }
}
//    public void printabc(){
//        System.out.println("abc");
//    }
//    public void printabc(String a){
//        System.out.println("abc"+a);
//    }
class Leaf extends Mid{
    static{
        System.out.println("Leaf的静态初始化块");
    }
    {
        System.out.println("leaf的普通初始化块");
    }

    public  Leaf(){
        super("qersf");//通过super调用父类中有一个字符串参数的构造器
        System.out.println("------执行leaf的构造器------");
    }
}


public class BlockInitTest {
    public static void main(String[]args){
        new Leaf();
        new Leaf();
    }
}
