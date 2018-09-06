package chongshi20180903;

/**
 * Created by Administrator on 2018/9/5.
 */
public class test20180905_2 {
    public static void main(String[] args) {
        test t = new test("1ad","2x22");
t.getinfo();
        test t2 = new test("123");
        t2.getinfo();

        p3 p3shili = p3.pp;
        p3shili.ppprint();

        p3 p3shili2 = p3.getPp2();
        p3shili2.ppprint();
    }
}

class test {
    {
        System.out.println("这个是一个构造方法块");
    }
    //
    private String a;
    private String b;
    public test() {
        System.out.println("===========");
    }
    public test(String aa ,String bb) {
        this();
        this.a = aa;
        this.b = bb;
    }

    public test(String a) {
        this();
        System.out.println("没有完全指定默认参数。");
    }

    public void getinfo() {
        System.out.println(this.a +" " +this.b);
        System.out.println(this);
    }

}

class p2{
    private int a = 1;
    private static int b = 2;

    public void aa() {
        System.out.println(a+" " +b);
    }

    public static void bb() {
//        System.out.println(a+" " +b);//注意这里的a是无法调用的
        //static声明的方法是不能调用非static类型声明的属性或方法
    }

}

class p3{

    static p3 pp = new p3();
    private p3(){}  // 外部运行私有构造方法1//这里构造方法是私有的 所以 外部无法直接运行 需要通过上面这句把它实例化 成属性。并且static化  让外部可以直接调用。 p3 p3shili = p3.pp;

    //外部运行私有构造方法2//
    private static p3 pp2 = new p3(1); //这里加上了private 外部无法直接运行。需要添加一个外部能访问的方法调用pp2这个实例才行
    public static  p3 getPp2 () { //类型 p3  方法名
        return pp2;    //返回 p3 实例 pp2
    }
    private p3(int a ) {}

    public void ppprint() {
        System.out.println("this is a ppprint func");
    }
}