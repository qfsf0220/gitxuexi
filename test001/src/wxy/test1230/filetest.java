package wxy.test1230;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * @author feng.qian
 * @create at 2016-12-30 10:11
使用 FileReader 类读取文件

FileReader 类是 Reader 子类 InputStreamReader 类的子类，因此 FileReader 类既可以使用Reader 类的方法也可以使用 InputStreamReader 类的方法来创建对象。

在使用 FileReader 类读取文件时，必须先调用 FileReader()构造方法创建 FileReader 类的对象，再调用 read()方法。FileReader 构造方法的格式为：
public FileReader(String name);  //根据文件名创建一个可读取的输入流对象

需要注意的是，Java 把一个汉字或英文字母作为一个字符对待，回车或换行作为两个字符对待。
 */


public class filetest {
    public static void main(String[] args) throws IOException {
        char [] a = new char[1000];
        FileReader b= new FileReader("D:\\tmp.txt");
        int num = b.read(a);
        String str = new String(a,0,num);
        System.out.println("读取的字符个数为："+num+",内容为：\n");
        System.out.println(str);
        b.close();

    }
}
