package test170102;

import java.io.*;

/**
 * Created by qf on 2017/1/2.
 */
public class filerw {
    public static void main(String []args){
//        文件字节输入流
        File file  = new File("/Users/qf/test/test.txt");
        File file2  = new File("/Users/qf/test/testdir/test0105.txt");

        byte[] b = new byte[100]; //定义100 就是每100个字符读取
        String aaa = "i am  qf";
         byte [] bb = aaa.getBytes();//这里吧字符串转换为目标的字节数组
        int  temp = 1;
        try {
            FileInputStream is = new FileInputStream(file);
            while( (temp =is.read(b))  != -1){ //把 int temp 设置为每次读取的字节数 ，当字节数等于-1 代表读取结束。
                String string = new String (b,0,temp);
                System.out.println(string);

            }
            is.close();

            FileOutputStream os = new FileOutputStream(file2);//这里是吧bb读取内容写到file2里面
            os.write(bb);
            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
