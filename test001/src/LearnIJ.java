import javax.jnlp.UnavailableServiceException;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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
