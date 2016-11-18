/**
 * Created by mac on 16/11/18.
 */
class test1118 {
    public  static void main(String[] args){
        int x=10,y=20;
        //单独调用（不推荐）
        sumsum(x,y);
        //输出调用
        System.out.println(sumsum(x,y));
        //赋值调用 （推荐）
        int aa = sumsum(x,y);
        //对于调用结果aa 可以进行其他操作。
        System.out.println(aa);
    }
    /**
     * 求和,返回值类型 int  参数列表  2个 都是int
     **/
    public static  int sumsum(int a , int b){
        return a+b;
    }



}
