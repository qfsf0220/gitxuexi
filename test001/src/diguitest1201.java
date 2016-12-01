/**
 * 递归就是允许方法调用自身的特性--递归方法
 *
 * @author feng.qian
 * @create at 2016-12-01 15:03
 */
//class factorial{ //阶乘
//    int fact(int n){
//        if(n==1){
//            return 1;
//        }
//        int result = fact(n-1)*n;
//        return result;
//    }
//
//}



class testxx{
//    final static int AAAA= 1;
    final int AAAA =111;
    int fact(int n){
        if (n==1) return 1;
        int jiguo =fact(n-1)*n;
        return jiguo;
    }
/*/////////////
第一个循环5 *4 --20
 第二个循环3 *2 --6
第三个循环 2*1 --2
第四个循环  if n ==1 return 1
20*6*2*1 --120
*/////////////
//    public int aa(){
//        return AAAA;
//    }


}

public class diguitest1201 {
    public static void main(String[] args) {
//        factorial f = new factorial();
//        System.out.println("3:"+f.fact(1));
//        System.out.println("3:"+f.fact(3));
//        System.out.println("5:"+f.fact(5));
//        System.out.println("10:"+f.fact(10));
//        System.out.println("----------");
        testxx x2x = new testxx();
        System.out.println("x:"+x2x.fact(5));
        System.out.println("aaa:"+x2x.AAAA);
    }
}
