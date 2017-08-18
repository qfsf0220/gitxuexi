package heima.test0816;

/**
 * Created by Administrator on 2017/8/16.
 *
 change master to master_host='172.25.2.14',master_user='repl', master_password='1234', master_port=3306, master_log_file='uat-mysql-bin.000001', master_log_pos=120, master_connect_retry=30;
 */
//自定义错误。
public class SelfTryCatch {
    public static void main(String[]a){
        Demo816004 d4 = new Demo816004();
        try {
            int x = d4.div(5,-1);
            System.out.println(x);
        } catch (FushuException e) {
            System.out.println(e.toString());
            System.out.println("所传负数值是:"+e.getValue());

        }
        System.out.println("这行需要打印");
    }
}

class FushuException extends Exception{//自定义一个异常类 ，需要继承Exception
    private int value;
    FushuException(){
    }
    FushuException(String msg,int value){
        super(msg);
        this.value=value;
    }

    public int getValue() {
        return value;
    }
}
//函数内出现throw 抛出异常的话，需要在内部try catch处理 或者在函数上声明，让调用者处理。
class Demo816004{
    int div(int x,int y) throws FushuException{ //通常 函数内出现异常，函数上需要声明
        if (y<0){
            throw new FushuException("负数是不可以的。",y);//手动通过throw抛出错误。
        }
        return x/y;
    }
}