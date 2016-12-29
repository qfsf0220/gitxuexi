/**
 * Created by qf on 2016/12/29.
 */
public class stringbuffer_test1229 {
    public static void main(String [] args){
        StringBuffer sb = new StringBuffer();

        sb.append("你好");//可以  append 各种类型
        System.out.println(sb);//一般不这样打印
        System.out.println(sb.toString());//一般都是这样用toString转换为字符串输出
        sb.append(123);
        sb.append("boss");
        sb.append(5.555);
        System.out.println(sb.toString());

        char x = sb.charAt(5);//打印第5个字符
        System.out.println(x);
        sb.setCharAt(5,'换');//setCharAt(int x,char ch)  替换x的字符为 ch字符串
        sb.insert(2,"我是insert。");//insert  插入到指定位置   位置  所插入字符串
        System.out.println(sb.toString());
        sb.reverse();//翻转字符
        System.out.println(sb);
        //deleteCharAt （int startindex ，int endindex）
        sb.replace(2,20,"替换");///replace int1 startindex  int2 endindex str3 所换字符
        System.out.println(sb);
    }
}

