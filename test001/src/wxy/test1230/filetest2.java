package wxy.test1230;

import java.io.*;
import  java.io.BufferedInputStream;

/**
 * @author feng.qian
 * @create at 2016-12-30 10:47
使用 BufferedReader 类读取文件

BufferedReader 类是用来读取缓冲区中的数据。使用时必须创建 FileReader 类对象，再以该对象为参数创建 BufferedReader 类的对象。BufferedReader 类有两个构造方法，其格式为：
public BufferedReader(Reader in);  //创建缓冲区字符输入流
public BufferedReader(Reader in,int size);  //创建输入流并设置缓冲区大小

在 JDK API 文档中，可以看到readLine方法的提示：readLine 方法有时产生 IOException。如何处理潜在的故障？编译器需要“捕获”或“声明”IOException。
“捕获 (catch)”指当 readLine 方法产生错误时截获该错误，并处理和记录该问题。而“声明 (declare)”指错误可能引发 IOException，并通知调用该方法的任何代码：可能产生异常。若要捕获异常，必须添加一个特殊的“处理代码块”，来接收和处理IOException。于是程序改为如下：
 */


public class filetest2 {
    public static void main(String[] args) throws IOException { //若不准备捕获 IOException，仅声明异常，则要特别指定 main 方法可能出错，而且特别说明可能产生 IOException。
        String oneline;
        int count = 0;
        FileReader a = new FileReader("d:\\tmp.txt");
        BufferedReader b = new BufferedReader(a);
        while((oneline=b.readLine()) != null){
            count++;
            System.out.println(oneline);
        }
        System.out.println("一共读了"+count+"行。");
        b.close();
    }
}
