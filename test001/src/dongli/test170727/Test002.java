package dongli.test170727;

/**
 * Created by qf on 2017/7/29.
 */
public class Test002 {
    public static  void main(String []args){
        TestTest001 tt =new TestTest001();
        System.out.println(tt.getClass());
        System.out.println(tt.a());
    }
}

class TestTest001{
    public  int a(){
        return 123;
    }
}