package chongshi20180903;

/**
 * Created by Administrator on 2018/9/5.
 */
class test180905x {
    int a;
    int b;
    public test180905x(){
        this.a = 123;
        this.b = 345;
        System.out.println("这里使用了默认的 a和b");
    }

    public test180905x(int a, int b) {
        this.setA(a);
        this.setB(b);
        System.out.println("你自己设置了a:"+getA());
        System.out.println("你自己设置了b:"+getB());
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void  allinfo() {
        String a = "a:" + getA() + " b:" + getB();
        System.out.println(a);
    }
}
public class test180905 {
    public static void main(String[]args){
        test180905x tx = new test180905x(222,888);
        tx.allinfo();
        //这里使用匿名对象
        new test180905x().allinfo();

        String str123 = "abcdefgh";
        for (int i=0;i<100;i++) {
            str123 += i;
        }
        System.out.println(str123);
        int a = str123.length();
        System.out.println(a);

        tx.a = 999;
        tx.b = 8888;
        tx.allinfo();


        }
}