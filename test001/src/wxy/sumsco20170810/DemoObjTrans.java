package wxy.sumsco20170810;

import KFjava.test20170508.SuperBaseclass;

import java.util.SplittableRandom;

/**
 * Created by Administrator on 2017/8/10.
 */
public class DemoObjTrans {
    public static void main(String []a){
        SuperClass superobj = new SuperClass();
        SonClass sonobj = new SonClass();

        // 下面的代码运行时会抛出异常，不能将父类对象直接转换为子类类型
        // SonClass sonObj2 = (SonClass)superObj;

        // 先向上转型，再向下转型
        superobj = sonobj;
        SonClass sonObj1 = (SonClass)superobj;


        if (superobj instanceof SonClass){
            SonClass sonObj = (SonClass)superobj;
        }else {
            System.out.println("转换失败");
        }

        superobj=sonobj;//先向上转型，子类对象必须向上转型后，才能再向下转型。
        //这里 superobj 变成了 Sonclass的实例。
        if (superobj instanceof SonClass){
            SonClass sonObj2 = (SonClass)superobj;
            System.out.println("这里是可以转换的。");
        }else {
            System.out.println("转换失败");
        }
    }
}

class SuperClass{ }
class SonClass extends SuperClass{ }