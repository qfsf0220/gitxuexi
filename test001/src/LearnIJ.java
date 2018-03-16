import javax.jnlp.UnavailableServiceException;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.DoubleSummaryStatistics;

/**
 * Created by Administrator on 2018/3/15.
 */
public class LearnIJ {
    private  String name;
    private  int a;

    public static void main(String[] args) {
        LearnIJ l = new LearnIJ("",1);
        f();
        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("finally..");
        }
        System.out.println("over");

        ErrorChain ec = new ErrorChain();
        try {
            ec.test2();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            String abc = new String("各位老总不错的。");
            System.out.println(abc.length() + "--"+abc.indexOf('的'));
            StringBuilder str1 = new StringBuilder("");//空string 对象
            StringBuilder str2 = new StringBuilder("asbc"); //创建一个字符串 “abc“
            System.out.println(str2);
            str1.append("nihao").append(",hi  ");
            str1.insert(4, "boss");
            str1.append(str1.length());
            System.out.println(str1.toString());
            Integer m = new Integer(55);
            Integer n = new Integer("1233333");
            System.out.println(n);
        }

    }

    private static void f() {

    }

    public void v1(String a){
        if (a != null) { //a.nn

        }
    }

    public LearnIJ(String name,int a){
        this.name = name; //name.field
        this.a = a;  //a.field
    }

    public LearnIJ(){
        for (int i = 10; i > 0; i--) {

        } // 10.forr
        for (int i = 0; i < 10; i++) {
            System.out.println(new Date()); // new Date().sout
            System.out.printf("-%S-","qqqq");
        }//10.fori

    }


}

class MyException extends Exception {
    public MyException() {
    }
    public MyException(String a ) {
        super(a);
    }
}

class ErrorChain {

    public void test1() throws MyException {
        throw new MyException("this is a error.");
    }


    public void test2() {
        try {
            test1();
        } catch (MyException e) {
            RuntimeException re = new RuntimeException(e);
//            re.initCause(e);
            throw re;
        }

    }
}


class baozhuanglei{
    double a = 99.5;
    Double d_a_manual = new Double(a);//手动装箱
    Double d_a_auto = a;//自动装箱


}