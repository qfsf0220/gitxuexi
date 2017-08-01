package dongli.test170727.test20170731;

/**
 * Created by Administrator on 2017/8/1.
 */
public class testfz {
     void printabc(){
        System.out.println("abc");
    }
    static  void printcba(){
        System.out.println("cba");
    }
    public  static void main(String[]aaa){
        printcba();
        testfz tf=new testfz();
        tf.printabc();
        System.out.println(tt.b);
    }
}

/*java 内部类为什么不能用静态方法

非static的内部类，在外部类加载的时候，并不会加载它，所以它里面不能有静态变量或者静态方法。

static类型的属性和方法，在类加载的时候就会存在于内存中。
要使用某个类的static属性或者方法，那么这个类必须要加载到jvm中。
基于以上两点，可以看出，如果一个非static的内部类如果具有static的属性或者方法，那么就会出现一种情况：内部类未加载，但是却试图在内存中创建static的属性和方法，这当然是错误的。原因：类还不存在，但却希望操作它的属性和方法。

如果内部类没有static的话，就需要实例化内部类才能调用，说明非static的内部类不是自动跟随主类加载的，而是被实例化的时候才会加载。

而static的语义，就是主类能直接通过内部类名来访问内部类中的static方法，而非static的内部类又是不会自动加载的，所以这时候内部类也要static，否则会前后冲突。

 */
class tt{
    static int b;
    private static int  a ;

      void setA(int a) {
        this.a=a;
    }

    public int getA() {
        return a;
    }
}