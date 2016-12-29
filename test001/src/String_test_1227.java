/**
 * Created by qf on 2016/12/27.
 */
public class String_test_1227 {
    public static void main(String []args){
        String str1 = "hello boss";
        System.out.println(str1);


        String str2 =new String("very well"); //String 是一个类 所以有构造方法
        //这里 几个都是构造对象
        System.out.println(str2);

        char[] c = {'a','b','c'};

        String e[] ={"AAA","BBB","CCC"};
        for (String i:e){
            System.out.println(i);
        }
        String str3 = new String(c);
//        String str33 = new String(d);

        System.out.println(str3);

        String str4 = new String(c,1,2);//从c的1开始 后面2个字符
        System.out.println(str4); //所以打印是 bc

        System.out.println("------------字符长度");
        int strlong =str1.length();
        System.out.println(strlong);
        System.out.println("------------字符串实体是否相等");
        boolean yorn = str1.equals(str2);
        System.out.println(yorn);
        System.out.println("------------字符串是否是指定 头和 尾");
        boolean b= str2.endsWith("well");
        boolean b2=str2.startsWith("v");
        System.out.printf("b是%s,b2是%s",b,b2);
        System.out.println("------------字符串是否是包含xx字符");
        boolean existsma = str1.contains("o b");
        System.out.println(existsma);
        System.out.println("------------xx字符在什么位置");
        int p = str1.indexOf("l");//相关方法indexOf(String s ,int startpoint)这个startpoint 意思是从哪里开始检索， lastIndexOf(String s) 最后出现的位置
        System.out.println(p);
        System.out.println("------------获得当前字符串的子串 剪切");
        String strx = str1.substring(4);//相关的 substring(int start ,int end)
        System.out.println(strx);
        System.out.println("------------去掉前后空格 类似py");
        String strz = "    nong  hao       ";
        System.out.println(strz.trim());

    }
}
