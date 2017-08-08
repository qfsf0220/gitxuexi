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
class StringToInt{
    public static void main(String[]a){
        int m = 500;
        String sm = Integer.toString(m);
        System.out.printf("字符串：%s",sm);
    }
}



class Demo{  //手动装箱 拆箱
    public  static void main(String[]a){
        int m = 500;
        Integer intttt = new Integer(m);//手动装箱
        int n = intttt.intValue();//手动拆箱
        int t = intttt;//自动拆箱。
        System.out.println("n="+n);

        Integer inttt2 = new Integer(500);
        System.out.println("inttt 和 intttt2 一样?"+ intttt.equals(inttt2));
    }
}

class Demo2{ //自动装箱  拆箱。
    public static  void main(String[]args){
        int m = 500;
        Integer objint = m;//自动装箱
        int n  = objint;//自动拆箱
        System.out.printf("int n %d:",n);

        Integer objint2 = 500;
        System.out.println("objint 等价于 objint2?"+objint.equals(objint));
    }
}