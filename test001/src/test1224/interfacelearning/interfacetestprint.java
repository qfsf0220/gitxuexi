package test1224.interfacelearning;

/**
 * Created by qfsf on 2016/12/24.
 */
public class interfacetestprint {
    public static void main(String[] args) {
        qf q = new qf();
        sf s = new sf();
        System.out.println("sf 的 result "+s.getsum(20));

        System.out.println("---  答案不同  ---");

        System.out.println("qf 的result " +q.getsum(20));
    }
}
