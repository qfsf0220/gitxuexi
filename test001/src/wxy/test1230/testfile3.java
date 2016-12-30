package wxy.test1230;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author feng.qian
 * @create at 2016-12-30 11:41
 *
使用 FileWriter 类写入文件

FileWriter 类是 Writer 子类 OutputStreamWriter 类的子类，因此 FileWriter 类既可以使用 Writer类的方法也可以使用 OutputStreamWriter 类的方法来创建对象。

在使用 FileWriter 类写入文件时，必须先调用 FileWriter()构造方法创建 FileWriter 类的对象，再调用 writer()方法。FileWriter 构造方法的格式为：
public FileWriter(String name);  //根据文件名创建一个可写入的输出流对象
public FileWriter(String name,Boolean a);  //a 为真，数据将追加在文件后面
 */


public class testfile3 {
    public static void main(String[] args) {
        try{
        FileWriter a = new FileWriter("d:\\tmp.txt");
        for (int i =32 ;i<126;i++){
            a.write(i);
        }
            a.close();
        }
        catch (IOException e ){

        }

    }
}
