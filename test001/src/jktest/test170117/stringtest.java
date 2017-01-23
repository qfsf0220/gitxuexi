package jktest.test170117;

/**
 * @author feng.qian
 * @create at 2017-01-22 14:45
 */


public class stringtest {
    public static void main(String[] args) {
        String S;
        int [] a = {1,2,3,4};
        char [] c = new char[a.length];
        for(int i=0; i<a.length;i++){
            c[i]=(char)(a[i]+48);
//            System.out.println(c[i]);
        }
        String s = new String(c);
        System.out.println(s);



        char[] chara = {'a','b','c','d','e','f','d'};
        System.out.println(chara);
        String ca = new String(chara);
        System.out.println("上面字符串的字符个数:"+ca.length());
        System.out.println("此方法返回字符串中 index 位置上的字符，其中index 值的 范围是 0~length-1  ->"+ca.charAt(3));
        System.out.println("返回字符在字符串中出现的第一个和最后一个的位置:"+ca.indexOf('d')+"  "+ca.lastIndexOf('d'));
        System.out.println("返回子串 str 中第一个字符在字符串中出现的第一个和最后一个的位置 "+ca.indexOf("12"));//-1就是没有
        System.out.println("返回字符 ch 在字符串中位置 fromIndex 以后出现的第一个和最后一个的位置 "+ca.lastIndexOf('d',5));

        char [] aaa =new char[]{'q','f','s','f','0','2','2','0'};

        ca.getChars(1,5,aaa,0);
        System.out.println(aaa);
        System.out.println("参数1 需要匹配的第一个字符在源串的位置，参数2 要匹配的最后一个字符在源串中的位置，参数3  字符数组存放目的字符串 参数4 匹配字符串在目的串中的其实位置  ");
//        System.out.println(ca);
        System.out.println("------------ String 类的常用方法");

        String test  = "各位老总你们好啊。老总1，张总，老总2，杨总。";

        String test2 = test.concat("还有杨董"); //concat  合并
        System.out.println(test2);

        String test3 = test.replace('杨','s'); //replace 替换
        System.out.println(test3);

        System.out.println(test.substring(0,7));// substring 截取

        System.out.println(test3.toUpperCase());//toLowerCase 大小写 转换。

        System.out.println("---------------StringBuffer 类常用的方法。");

        StringBuffer sba = new StringBuffer(test);
        sba.append("还有谁？！");
        System.out.println(sba);
        sba.insert(15,"我要打10个!");
        System.out.println(sba);
        sba.setCharAt(10,'啥');//like replace
        System.out.println(sba);
        System.out.println(sba.equals(test2)); //比较字符

        Integer inta = 1; //
        System.out.println(inta.toString()); //int 无法直接使用 toString 方法。


    }
}
