package KFjava;

/**
 * @author feng.qian
 * @create at 2017-03-01 15:40
 */


public class chartest {
    public static void main(String[] args) {
        //直接指定单个字符作为字符值
        char charaa= 'a';
        //使用转义字符作为字符值
        char charbb = '\r';
        //使用unicode编码来指定字符值
        char chch = '\u1234';
        System.out.println(chch);
        System.out.println("-----");
        //定义一个字符值
        char  zhongwen = '發';
        int zhongvalue = zhongwen;

        System.out.println(zhongvalue);
        System.out.println("-----");
        //直接把一个 0-65535 范围内的int整数赋值给char变量
        char  cc = 9999;//由于计算机保存字符时，实际上市保存该字符对应的编号。
                        //所以char值 也可以直接作为整数使用。范围是0-65535
        System.out.println(cc);

    }
}
