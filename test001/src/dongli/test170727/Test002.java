package dongli.test170727;

/**
 * Created by qf on 2017/7/29.
 */
public class Test002 {
    public static  void main(String []args){
        TestTest001 tt =new TestTest001();
        System.out.println(tt.getClass());
        System.out.println(tt.a());
        tt.b();
        Test002.a();
        Test002 t = new Test002();
        t.aa();
    }

     static private void  a(){
        System.out.println("test");
    }
    static void aa(){
        System.out.println("test2");
    }
}

class TestTest001{
    public  int a(){
        return 123;
    }

    void b(){
        System.out.println("test3");
    }
}