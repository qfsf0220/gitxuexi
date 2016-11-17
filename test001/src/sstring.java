import java.io.File;
import java.util.*;
public class sstring{
    public static void main (String [] agrs) {
        String sss= "hello";
        String ss2 = sss.substring(0,3);
        System.out.println(ss2);

        String ss22 = ss2.substring(0,1)+"i, boss!";
        System.out.println(ss22);
        System.out.println(ss2.equals(ss22));//equals 用来判断字符串是否相等。
        System.out.println("hi, boss!");
        System.out.println(ss22.equals("hi, boss!"));//equals 用来判断字符串是否相等。
        int n =ss22.length();
        System.out.println(n);//length 返回UTF-16编码表示的代码单元数量。
        int n2 = ss22.codePointCount(0,ss22.length());

        System.out.println(n2);//实际长度,即代码点数量。
        System.out.println(ss22.charAt(5));//调用charAt(n)返回位置n的单元，n是 0~slength() 之间。
        System.out.println(ss22.toUpperCase());
        System.out.println(ss22.replace("boss","qf"));
        System.out.println(ss22.endsWith("!"));
        StringBuilder builder  = new StringBuilder();
        builder.append("avc");
        builder.append("bbb");
        builder.append("ccc");
        String aaaa =builder.toString();
        System.out.println(aaaa);
        Scanner in = new Scanner(System.in);
        System.out.println("what is your name:");
        String name = in.nextLine();

        System.out.println("How old are you:");
        int age = in.nextInt();
        System.out.println("Hello "+name+",you are "+age+" years old.");
        System.out.printf("Hello %s ,you are %d years old.\n",name,age);

        double fudianshu =  3088.88888888;
        System.out.printf("%10.2f\n",fudianshu);
        System.out.printf("%,.4f\n",fudianshu);
        
        String aaa="aaaa";
        int bbb=12345;
        String message = String.format("string:%s  int:%d",aaa,bbb);//通过静态的string.format方法创建一个格式化字符串（可以不用输出）
        System.out.printf("%tFT\n",new Date());
//        Scanner in2 = new Scanner(new File("/tmp/111.txt"));
//        System.out.println(in2);
//        PrintWriter oout = new PrintWriter("/tmp/111.txt");
//        System.out.println(oout);
    }

}
