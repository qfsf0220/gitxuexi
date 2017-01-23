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
    }
}
