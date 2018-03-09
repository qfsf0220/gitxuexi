package test180227;

/**
 * Created by Administrator on 2018/3/7.
 */
public class inheritTest {
    public static void main(String[] args) {
        son s = new son();
        s.getid();
        System.out.println("-----");
        s.dosuperfunc();
        s.toString();
        System.out.println(s);
        System.out.println(s.equals( new son() )  );// new son() 开辟了新的内存空间
        System.out.println("############多态");
        base aaa = new base();
        base bbb = new son();//向上类型转换
        base ggg = new other();
        aaa.aaa();
        bbb.aaa();
        ggg.aaa();//这里的aaa 方法是从base继承的 aaa 方法
        son ss1 = new son();
        base ccc = ss1; //自动类型提升 向上类型转换

//        son ss2 = ccc;//这里 向下类型转换编译器出错 需要加上 子类 引用类型
        son ss2 = (son) ccc; //强制类型下降  想下类型转换

//        other ss3 = (other) ccc; //这里运行报错。 编译时 是通过other类型编译。运行时 对象是 son 类型 这里强制转为other类型 不匹配

        System.out.println(ccc instanceof other );
        System.out.println(ccc instanceof son );
        if (ccc instanceof  other){
            other ss3 = (other) ccc;
        }else {
            System.out.println("not not change");
        }
        abcde ae = new bcd();
        ae.ppp();
        abcde ae2 = new cde();
        ae2.qqq();

        //接口的实现类似 抽象类： 接口的引用 指向 已经实现了接口的对象
        Ijjj inter1 = new newabc();
        inter1.saidabc();

        Ijjj inter2 = new newnba();
        inter2.saidabc();

        // 匿名内部类 方式 使用接口
        Ijjj inter3 = new Ijjj() {
            @Override
            public void saidabc() {
                System.out.println("匿名内部类方式 实现接口");
            }
        };
        inter3.saidabc();
        //直接调用接口 使用
        new Ijjj(){public  void saidabc(){
            System.out.println("直接 引用 匿名内部类方式 实现接口");
            }
        }   .saidabc();   //这里点 加 方法 直接调用接口对象的方法


    }
}

class base{ // 父类继承于 Object类
    int id =1;
    public base(){
        System.out.println("base \'s init func");
    }
    void aaa(){
        System.out.println("base - aaa");
    }
}

class son extends base{

    int id = 2;
    public void aaa(){
        System.out.println("son - aaa");
    }
    public son(){
        //默认是隐士 调用父类的构造方法 super()
        //如果显示的调用父类的构造方法  必须放在构造方法的第一行
        //如果子类构造方法中没有显示调用父类的构造方法，父类又没有无参的构造方法，编译报错。
        super();
        System.out.println("class son \'s init func");

    }
    void getid(){
        System.out.println("super:"+super.id + " this:" +this.id);
    }
    void dosuperfunc(){
        super.aaa();//调用父类aaa()方法
        aaa();//调用当前类aaa方法
    }

    @Override
    public String toString() {
        return  String.valueOf(id);
    }
}

class other  extends  base{

}

abstract  class abcde{ //定义一个抽象类，只需声明 无需实现，继承类来实现
    public abstract void ppp();//如果有一个抽象方法就必须声明为抽象类
    public abstract void qqq();
    public void rrr(){} //抽象类可以包含普通类
}

class bcd extends abcde { //继承的子类必须实现抽象方法
    public void ppp(){
    }
    public void qqq(){
    }
}

class cde extends abcde{ //抽象类只能通过引用变量来创建 abcde atoe = new bcd() /abcde atoe2 =new cde()
    public void ppp(){}
    public void qqq(){}
}

/////接口

interface Ijjj{
    public void saidabc();
}

class newabc extends base implements Ijjj{ //这里 继承了 base父类  又实现了 Ijjj 接口 虽然继承方法只能1个 但是是实现接口可以多个。

    @Override
    public void saidabc() {
        System.out.println("abc");
    }
}

class newnba implements Ijjj{

    @Override
    public void saidabc() {
        System.out.println("abc");
    }
}

