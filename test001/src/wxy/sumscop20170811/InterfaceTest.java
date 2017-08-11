package wxy.sumscop20170811;

/**
 * Created by Administrator on 2017/8/11.
 */
public interface InterfaceTest{
    public static final int connect=5;
    public void write(String data);
    public String read();
}
//注意：接口中声明的成员变量默认都是 public static final 的，必须显示的初始化。因而在常量声明时可以省略这些修饰符。
// 变量必须是 public static final  或者没有
// 方法必须是public 类型
// 方法必须不能有 static 方法
// 必须只能是抽象方法  () 后面加了{}就报错。