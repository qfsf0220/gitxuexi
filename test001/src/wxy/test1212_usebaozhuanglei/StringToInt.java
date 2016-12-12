package wxy.test1212_usebaozhuanglei;

/**
 * 将字符串转换为整数
 *
 * Integer 类有一个静态的 paseInt() 方法，可以将字符串转换为整数
 * @author feng.qian
 * @create at 2016-12-12 10:15
 */


public class StringToInt {
    public static void main(String[] args) {
        String [] str = {"123","123a","b123","zxc"};

        for(String i:str){
            int j =10;
            try{
                int m=Integer.parseInt(i,j);
                System.out.println(i+"可以转成"+j+"进制的数字"+m);
            }catch (Exception e ){
                System.out.println(i+"不能转换  "+"错误提示："+e);
            }
        }

        int a = 88888;
        String atos= Integer.toString(a);
        System.out.println("数值转成字符串:"+atos);

    }
}
