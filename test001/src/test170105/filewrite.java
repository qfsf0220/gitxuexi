package test170105;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by qf on 2017/1/5.
 * 这个是一个比较典型的 写入 和读取的例子
 */
public class filewrite {
    public static void main (String []args){
        String content = " hi ,我是 qf!"; //需要写入 的内容
        File file = new File("/Users/qf/test/testdir/test0105_2.txt");//创建对应要写入的文件
        char [] a = content.toCharArray();//字符串转换为字符数组

        try {
            FileWriter fw = new FileWriter(file);//文件字符输出流，
            fw.write(a);//写入字符数组
            fw.close();//关闭文件   可以看到  test0105_2.txt

            FileReader fr = new FileReader(file);//读取  文件字符输入流
            //读取为循环读取 直至读到文件尾巴
            char [] b = new char[100];//设置每次读取的长度
            int count =0;//读取次数 初始值 设为0
            while ((count=fr.read(b)) != -1){//fr带上字符数组读，不等于-1说明可以继续读，-1 代表结束了。 这里读一次就结束了。
                String strx = new String(b,0,count);//这里吧字符数组 转成了 字符串输出
                System.out.println(strx);//打印
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
