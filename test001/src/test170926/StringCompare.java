package test170926;

/**
 * Created by Administrator on 2017/9/26.
 */
public class StringCompare {
    public static void main(String[] args) {
        String a = new String("aaa");
        String b = "aaa";
        Object os = a;
        String a1 = new String(a);
        String c= "cccc";
        String d ="aaa";

        int i = a.compareTo(b);
        System.out.println(i);
        int i2 = a.compareTo(c);
        System.out.println(i2);

        System.out.println(a.compareToIgnoreCase(b));
        System.out.println(a.compareTo(os.toString()));

        System.out.println("---");
        System.out.println(a.equals(a1));
        System.out.println(a.equals(d));
        System.out.println(b.equals(d));
        System.out.println(d.equals(c));
        System.out.println("---");
        System.out.println(a==b);
        System.out.println(b==d);
        System.out.println(a1==a);



    }
}
