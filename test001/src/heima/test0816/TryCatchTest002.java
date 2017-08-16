package heima.test0816;

/**
 * Created by Administrator on 2017/8/16.
 */
public class TryCatchTest002 {
    public static void main(String[]a)throws Exception {//这里向上抛给jvm jvm使用e.printStackTrace() 所以 还是会结束终止，需要用catch捕获错误。
        Demo81602 d = new Demo81602();
        try{
            int x =d.chu(66,0);
            System.out.println("x:"+x);
        }catch (Exception e){
            System.out.println(e.toString());
        }


        System.out.println("这行需要打印。");
    }
}
class Demo81602{
    int chu(int x,int y) throws Exception{//声明了问题需要抛出 主方法调用以后 需要捕获 或者是声明 以便抛出。

        return x/y;
    }
}
