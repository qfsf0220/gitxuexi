package wxy.sumsc;

/**
 * Created by Administrator on 2017/8/10.
 */
public class InstanceofTest {
    public static void main(String[]a){
        student sss = new student();
        boolean issssinObject =sss instanceof Object;
        System.out.println(issssinObject);

        boolean issssinteacher = sss instanceof qf;
        System.out.println(issssinteacher);

        sss = new qf();
        boolean issssstudent = sss instanceof student;
        System.out.println(issssstudent);
        boolean issssqf= sss instanceof qf;
        System.out.println(issssqf);
        boolean isssssf =sss instanceof sf;
        System.out.println(isssssf);
        //可以看出，如果变量引用的是当前类或它的子类的实例，instanceof 返回 true，否则返回 false。

    }

}
