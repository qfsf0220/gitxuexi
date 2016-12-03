package test1203;

/**
 * Created by qfsf on 2016/12/4.
 */
class r2{
    String a = "aaaaa";

}

public class classyingyongchuandi2 {
    public static void main(String[] args) {
        r2 rr = new  r2();
        rr.a ="bbb";     //和yingyongchuandi1的区别在于堆内存开辟了新的空间，所以rr断开了aa指向了新堆bb
        System.out.println("rr.a:"+rr.a);
        System.out.println("----------");
        tell(rr);//tell 方法创建了 rrr指向bbb rrr 调用自rr 开辟新空间断开bb 指向ccc rrr rr都指向ccc
        System.out.println("rr.a:"+rr.a);
    }

    public static void tell(r2 rrr ){
        rrr.a="cccc";
    }
}
