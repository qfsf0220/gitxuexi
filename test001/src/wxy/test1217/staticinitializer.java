package wxy.test1217;

/**
 * Created by qf on 2016/12/18.
 */
public class staticinitializer {
    public static int i=10;

//    static {
//        i =10;
//        System.out.println("now is static block");
//    }

    public void test(){
        System.out.println("test method  i:"+i);
    }

    public static void main(String []args){
        System.out.println("staticinitializer.i="+i);
        new staticinitializer().test(); //匿名
    }

}
