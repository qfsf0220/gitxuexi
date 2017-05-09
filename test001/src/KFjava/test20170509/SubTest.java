package KFjava.test20170509;



/**
 * Created by Administrator on 2017/5/9.
 */
class Base{
    public Base(){
        test();
    }
    public void test(){
        System.out.println("将被子类重写的方法");
    }
}

public class SubTest extends Base {
    private String name;
    public void test(){
//        System.out.println("子类重写父类的方法"+"Name 长度"+name.length());
        System.out.println("上面这个报错。");
    }
    public  static  void main(String[]args){
        SubTest s = new SubTest();//这里调用sub对象时，先执行Base中的Base构造器，而base构造器调用了test()方法，这里用的是子类的test方法。sub成员对象name为null，造成NullPointerException 错误。
        s.test();
        System.out.println("为了保证父类的良好封装性。不会被子类随意改变。设计父类应该遵循规则：" +
                "\n尽量隐藏父类的内部数据，尽量吧父类的所有成员设置成private访问类型,不要让子类直接访问父类的成员变量。"+"\n不让要子类随意访问 修改父类的方法。父类中辅助的工具方法应该使用private访问控制修饰符。"+"\n尽量不要在父类构造器中调用将要被子类重写的方法。"
        );
    }
}
