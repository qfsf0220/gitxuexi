package test170926;

/**
 * Created by Administrator on 2017/9/27.
 */
public class StringSplit {
    public static void main(String[] args) {
        String a="this is a test.";
        String[] split111 = a.split(" ");
        for(String as:split111){
            System.out.println(as);
        }
        String b = "this is second test.";
        System.out.println(b.replace('i','x'));
        System.out.println(b.replaceFirst("is", "ii"));
        System.out.println(b.replaceAll("is", "III"));
        System.out.println(b.toUpperCase());



    }
}
