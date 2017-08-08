package wxy.sumsc;

import java.util.IntSummaryStatistics;

/**
 * Created by Administrator on 2017/8/8.
 */
public class WrapperClass {
    public  static  void main(String[]a){
        String abc = "123";
        int aa = Integer.parseInt(abc);
        System.out.printf("%s---%d",abc,aa);
    }

}
class IntToString{
    public static  void main(String[]a){
        String [] strlist1={"123","555","abc123","123.6","zxc"};
        for (String i :strlist1){
            try{
                int m = Integer.parseInt(i,10);//radix 10进制
                System.out.printf("字符串:%s 转换成 数字:%d \n ",i,m);
            }catch (Exception e){
                System.out.printf("字符串:%s 无法转换成数字\n",i);
            }
        }

    }
}



class Demo{
    public  static void main(String[]a){
        int m = 500;
        Integer intttt = new Integer(m);//手动装箱
        int n = intttt.intValue();//手动拆箱
        System.out.println("n="+n);

        Integer inttt2 = new Integer(500);
        System.out.println("inttt 和 intttt2 一样?"+ intttt.equals(inttt2));
    }
}
