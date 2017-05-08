package KFjava.test20170508;

/**
 * Created by Administrator on 2017/5/8.
 */

class BaseClass{
    public int a = 33;
    int   b= 123;
}

public class SuperBaseclass extends BaseClass {
    public int a = 567;

    public void accessOwner() {
        System.out.println(a);
    }

    public void accessBase() {
        System.out.println(super.a);//通过spuer 来访问父类的a实例变量
        System.out.println(b);//不重名的话可以不用 spuer指定。
    }

    public static void main(String[] args){
        SuperBaseclass sbc = new SuperBaseclass();
        sbc.accessBase();  //33
        sbc.accessOwner(); //567
    }

}