package KFjava.test20170504;

/**
 * Created by Administrator on 2017/5/4.
 */
public class packageTest {
    public static void main(String []args){

        System.out.println("this is a package test.   " +
                "\njava的包机制需要2个方面的保证：" +
                "1.源文件里使用package语句指定包名。" +
                "2.class文件必须放在对应的路径下。");

        PrivateTest pt = new PrivateTest(); //这里用了 test20170504这个包里面的class PrivatrTest

        pt.setName("test name this name is out of range");
        System.out.println(pt.getName());

    }
}
