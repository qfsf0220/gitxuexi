/**
 * Created by qfsf on 2016/11/26.
 * 构造方法的注意事项：
 * 1 如果没有给出构造方法，系统将会在编译的时候自动创建无参构造方法
 * 2 如果给出了构造方法，系统就不会动了，将会使用写的构造方法。but 如果我们用了自己构造方法，如过还想用无参构造方法，就必须要自己
 * 给出。建议一直自己给出无参方法。
 *
 *
 * 给成员变量赋值的方法2种：
 * a：setXXX()  的方法
 * b： 构造方法
 *
 *
 */
class sss2{
    private String name;
    private int age;

    public sss2(){ //方法名和類名相同
        System.out.println("这个是无参数构造方法");
    }

    public sss2(String name){ //方法名和類名相同
        System.out.println("这是带一个String类型参数的构造方法");
        this.name=name;
    }
    public sss2(int age){ //方法名和類名相同
        System.out.println("这是带一个int类型参数的构造方法");
        this.age=age;
    }
    public sss2(String name,int age){ //方法名和類名相同
        System.out.println("这是带多个参数的构造方法");
        this.age=age;
        this.name=name;
    }

    public  void show(){
        System.out.println(name+"_____"+age);
    }

}


public class gouzaofangfa2test1126 {
    public static void main(String[]agrs){
        //create obj 0
        sss2 ss= new sss2();
        ss.show();
//create obj 1
        sss2 ss1=new sss2(27);
        ss1.show();
        //create obj 2
        sss2 ss2=new sss2(28);
        ss2.show();
        //create obj 3
        sss2 ss3=new sss2("qf");
        ss3.show();
        //create obj 4
        sss2 ss4=new sss2("sf",27);
        ss4.show();

    }
}
