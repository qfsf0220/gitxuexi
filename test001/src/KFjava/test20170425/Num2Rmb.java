package KFjava.test20170425;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/4/26.
 */
public class Num2Rmb {
    private String[] hanArr ={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
    private String []unitArr={"拾","佰","仟","萬"};
    private String[] divide(double num){
        long zheng= (long)num;
        long xiao  =Math.round((num-zheng)*100);
        return new String []{zheng +"",String.valueOf(xiao)};
    }
    private String toHanStr(String numStr){
        String result ="";
        int numLen=numStr.length();
        for (int i =0;i<numLen;i++){
            int num = numStr.charAt(i)-48;
            if(i!=numLen -1 && num !=0){
                result+=hanArr[num]+unitArr[numLen-2-i];
            }else{
                result+=hanArr[num];
            }
        }
        return  result;
    }

    public static void main(String []args ){
        Num2Rmb nr = new Num2Rmb();
        System.out.println(Arrays.toString(nr.divide(123123123123.123)));
        System.out.println(nr.toHanStr("1234"));
    }
}
