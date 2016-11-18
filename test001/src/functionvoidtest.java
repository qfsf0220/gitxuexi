/**
 * Created by mac on 16/11/19.
 */
public class functionvoidtest {
    public static void main(String [] args){
        for(int x=0;x<4;x++){
            for(int y=0;y<5;y++){
                System.out.print("*");
            }
            System.out.println();
        }//4行5列的输出
        //单独调用
    xinxin(10,9);
        //输出调用 System.out.println(xinxin(4,6))
        // 不行,报错 空类型
        //赋值调用 void vvv= xinxin(5,8)
        //不行。报错 非法的表达式

    }
    public static void xinxin( int a,int b){
        for (int x=0;x<a;x++){
            for (int y=0;y<b;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }



}
