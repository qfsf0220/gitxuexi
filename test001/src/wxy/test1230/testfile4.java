package wxy.test1230;

import java.io.*;

/**
 * @author feng.qian
 * @create at 2016-12-30 14:44
 *
使用 BufferedWriter 类写入文件

BufferedWriter 类是用来将数据写入到缓冲区。使用时必须创建 FileWriter 类对象，再以该对象为参数创建 BufferedWriter 类的对象，最后需要用 flush()方法将缓冲区清空。BufferedWriter类有两个构造方法，其格式为：
public BufferedWriter(Writer out);  //创建缓冲区字符输出流
public BufferedWriter(Writer out,int size);  //创建输出流并设置缓冲区大小
需要注意的是，调用 out 对象的 write()方法写入数据时，不会写入回车，因此需要使用newLine()方法在每行数据后加入回车，以保证目标文件与源文件相一致。

 */


public class testfile4 {
    public static void main(String[] args) throws IOException {
        String str = new String();

        BufferedReader in = new BufferedReader(new FileReader("d:\\tmp3.txt"));

        BufferedWriter out = new BufferedWriter(new FileWriter("d:\\tmp.txt"));

        while ((str= in.readLine()) != null){
            System.out.println(str);
            out.write(str);
            out.newLine();
        }
        out.flush();
        in.close();
        out.close();

    }
}
