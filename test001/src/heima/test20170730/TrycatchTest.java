package heima.test20170730;

/**
 * Created by qfsf on 2017/8/15.
 */
class TrycatchTest {
    public static void main(String[]a){
        Demo d = new Demo();
        int x =d.div(5,0);
        System.out.println(x);

        System.out.println("这里需要打印。");
    }
}

class Demo{
    int div(int a,int b){
        return a/b;
    }
}