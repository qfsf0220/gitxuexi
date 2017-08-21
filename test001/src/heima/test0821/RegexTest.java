package heima.test0821;

/**
 * Created by Administrator on 2017/8/21.
 */

public class RegexTest {
    public static void main(String[] args) {
        checkPhone();
    }

    public static void checkPhone(){
        String phone="13681891872";
        String regex = "[1-9][0-9]{10}";
        boolean flag = phone.matches(regex);
        if(flag){
            System.out.println("phone number is ok");
        }else System.err.println("phone number is error");
    }
}
