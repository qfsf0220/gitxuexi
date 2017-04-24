package KFjava.test20170424;

/**
 * Created by Administrator on 2017/4/24.
 */
public class TernaryCalc {
    public static void main(String   args[]){
        int a= 50>20?50:20;
        int b = 50<20?70:50;
        System.out.println( a>b? "a bigger b" :(a<b? "a smaller b":"a equal b"));
        // 这里  三目运算 嵌套了一个三目运算  (问题: 正确 答案1  : 错误 答案2 )
    }
}
