package KFjava.test20170508;

/**
 * Created by Administrator on 2017/5/8.
 */
class  parent{
    public String a = "1234";
        }
class son extends parent{
    //这里定义一个私有a 实例变量来隐藏 父类a的实例变量。
    private  String a = "5678";
}

public class HideTest {
    public  static  void main(String []args){
        son  s = new son();
//        System.out.println(s.a);//这里a是私有变量 无法访问。
        System.out.println(  ((parent)s).a);// 这里需要把s 显式的向上转型为parent 才能访问a
    }




}
