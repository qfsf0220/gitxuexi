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
    }
}

class base{
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
}