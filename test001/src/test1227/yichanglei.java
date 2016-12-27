package test1227;

/**
 * Created by qf on 2016/12/27.
 */
public class yichanglei {
    public static void main(String [] args){
        int a=10;
        int b= 0;

        aa aaa = new aa();
        aaa =null;
        try{
            int c = a/b;
            aaa.bb();
        }catch (NullPointerException e){ //这里的异常子类都是系统提供的，也可以使用Exception这个类 是异常的父类，同样可以捕捉异常。+
            System.out.println("这个是空指针错误");
        }catch (ArithmeticException e ){
            System.out.println("这个是算数运算错误");
        }

        //这里，使用自定义的错误方法，
        Bank bank = new Bank();
        try {
            bank.income(100,50);
        } catch (BankException e) {
//            e.printStackTrace(); //默认抛出标准错误信息
            e.showMessage();//这个是自己定义的错误
        }

    }
}

class   aa{
    void bb(){}
}

//这里是自定义异常
class BankException extends Exception{ //Exception是所有异常的父类
    void showMessage(){
        System.out.println("发生了异常");
    }
}

class  Bank {
    void income(int in,int out) throws BankException{
        if (in<0 || out >0){//这里 ||表示或者，表示如果 in小于0  或者 out大于0
            throw new BankException(); //这里有点路由的味道。这里抛出错误到上层 就是income，income也需要抛出 指定 自定义的 BankException类
        }
        //如果没有匹配 到 上面if的错误这里继续
        System.out.println("操作完成。");

    }
}



