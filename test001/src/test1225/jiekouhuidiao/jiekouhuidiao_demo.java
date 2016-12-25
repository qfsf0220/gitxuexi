package test1225.jiekouhuidiao;

/**
 * Created by qfsf on 2016/12/25.
 *
abstract类 和interface的比较。

abstract类 和 interface 都可以有abstract方法

 interface 中只能有常量 abstract类 皆可

 interface 中 只能有 abstract方法 abstract类中 皆可。

 */
public class jiekouhuidiao_demo {
    public static void main(String[] args) {
        Test test = new Tom();
        test.getSum(10);
        System.out.println("sum-tom="+test.getSum(10));

        test = new Bob();
        System.out.println("sum-bob="+test.getSum(10));
    }
}

interface Test{
    int getSum(int x);
}

class Tom  implements  Test{  //Tom类 实现 Test接口。
    @Override
    public int getSum(int x) {
        int sum=0;
        for (int i=1;i<=10;i++){
            sum+=i;
        }
        return  sum;
    }
}


class Bob implements  Test{
    @Override
    public int getSum(int x) {
        int a=x+10;
        return a;
    }
}