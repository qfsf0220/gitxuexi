package test170102;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by qf on 2017/1/2.
 */
public class filerw {
    public static void main(String []args){
//        文件字节输入流
        File file  = new File("/Users/qf/test/test.txt");

        byte[] b = new byte[100]; //定义100 就是每100个字符读取

        int  temp = 1;
        try {
            FileInputStream is = new FileInputStream(file);
            while( (temp =is.read(b))  != -1){ //把 int temp 设置为每次读取的字节数 ，当字节数等于-1 代表读取结束。
                String string = new String (b,0,temp);
                System.out.println(string);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
