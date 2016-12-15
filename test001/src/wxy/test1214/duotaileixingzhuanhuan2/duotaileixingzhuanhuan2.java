package wxy.test1214.duotaileixingzhuanhuan2;

/**
 * //因为向下转型存在风险，所以在接收到父类的一个引用时，请务必使用 instanceof 运算符来判断该对象是否是你所要的子类
 *
 * @author feng.qian
 * @create at 2016-12-15 14:10
 */
public class duotaileixingzhuanhuan2 {
    public static void main(String args[]) {
        SuperClass superObj = new SuperClass();
        SonClass sonObj = new SonClass();
        // superObj 不是 SonClass 类的实例
        if(superObj instanceof SonClass){
            SonClass sonObj1 = (SonClass)superObj;
        }else{
            System.out.println("①不能转换");
        }
        superObj = sonObj;
        // superObj 是 SonClass 类的实例
        if(superObj instanceof SonClass){
            SonClass sonObj2 = (SonClass)superObj;
        }else{
            System.out.println("②不能转换");
        }
    }
}
class SuperClass{ }
class SonClass extends SuperClass{ }

