package KFjava.test20170428;

/**
 * Created by Administrator on 2017/5/2.
 */
public class OverLoad {
    public static void test(){
        System.out.println("no args");
    }
    public  void test(String msg){
        System.out.println("重载test方法   "+msg);
    }
    public static void main(String[]args){
        OverLoad ol = new OverLoad();
        test();
        test();
        ol.test("胜多负少");
    }
}
