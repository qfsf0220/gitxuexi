package LYlesson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Administrator on 2017/9/6.
 */
public class FileWriteTest {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D://asciilist.txt");
        for (int i = 32;i<126;i++){
            fw.write(i);
        }
        fw.close();
        System.out.println("write ok.");
        char a[] = new char[500];
        FileReader fr = new FileReader("D://asciilist.txt");
        int num = fr.read(a);
        String str = new String(a,5,num);
        System.out.println("文本长度"+num);
        System.out.println(str);
    }
}
