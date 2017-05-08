package KFjava.test20170508;

import wxy.test1212_usebaozhuanglei.StringToInt;

/**
 * Created by Administrator on 2017/5/8.
 */
public class ConversionTest {
    public static void main(String[]args){
        double d = 12.3;
        long l= (long)d;
        System.out.println(l);
        int i = 5;
        Object obj = "objectttt";
        String objstr = (String)obj;
        System.out.println(objstr);
        Object objPri = new Integer(5);
        if(objPri instanceof String) {
            String str = (String) objPri;//强制类型转换可能会出现异常，因此通过instanceof判断先
        }else{
            System.out.println("can not conversion Integer  to String");
        }
    }
}
