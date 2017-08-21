package heima.test0821;

/**
 * Created by Administrator on 2017/8/21.
 */
public class StringTest001 {
    public static void main(String[] args) {
        int[] a = {1,2,3,54,5};
        System.out.println(a.length);//这里的length是数组的属性 没有括号
        String b = "123sad水电费一天的覆盖";
        System.out.println(b.length());//这个length是方法 需要括号。
        char c = b.charAt(9); //第9个字符
        System.out.println(c);
        int d= b.indexOf('s');//s在第几个字符位置出现
        System.out.println(d);
        int e= b.indexOf('电',4);
        System.out.println(e);

        String f = "service network restart";

        System.out.println(f.startsWith("ser"));//判断是否手ser开头
        System.out.println(f.endsWith("art"));//判断是否是art结尾
        System.out.println(3+"");//也可以String.valueOf(3); //把int 3 转换成String 3
        char[] ca ={'a','b','c','d','e','x'};

        String pinjie_str = new String(ca,3,3);  //把字符数组拼接成 字符串  第三个字符开始的3个
        System.out.println(pinjie_str);

        String sa="service";
        char[] cx = sa.toCharArray(); //字符串转换成array
        System.out.println(cx);
        for (char i :cx){   //循环打印 array
            System.out.println(i);
        }

        System.out.println(sa.replace('e','x'));//字符e替换为x
        System.out.println(sa.replace("ser","xxx"));//字符串的替换
        System.out.println(sa.replaceAll("[a-z]","1"));//正则匹配替换

        String Stringtolist="aa,sdf|re:dd";
        String[] s2l =Stringtolist.split("[,|:]");//通过 xx字符  切割
        for(String aa :s2l){
            System.out.println(aa);
        }

        System.out.println(sa.substring(2));//sa[2:]
        System.out.println(sa.substring(2,4));//sa[2:4]

        System.out.println(sa.toUpperCase());//转成大写
        String  saa="     xxxxxxaaaa   ";//去两端空格
        System.out.println(saa.trim());//对两个字符串进行自然顺序比较 和可以转成大写或小写以后比较

        String comparable1= "aac";
        String comparable2= "adb";
        int cp1cp2 = comparable1.compareToIgnoreCase(comparable2);//cp1比cp2 1的a 比 2的d小3 所以 返回-1 如果是大于 就是 正3 这里是字符编码（ASCII码）的差值。
        System.out.println(cp1cp2);




    }
}
