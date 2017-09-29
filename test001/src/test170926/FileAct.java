package test170926;

import java.io.*;
import java.nio.file.Path;


/**
 * Created by Administrator on 2017/9/29.
 */
public class FileAct {
    public static void main(String[] args) throws IOException {
        Path path = new File("E:/aaa.txt").toPath();
        System.out.println(path);
        System.out.println(path.getClass().getName());

        File mypath = new File("e:/test20170929/abc/");
        if (!mypath.exists()){
            mypath.mkdirs();
            System.out.println("mkdir ok.");
        }

        File file = new File("E:/test20170929/abc/1.txt");
        try {
            if(file.createNewFile())
                System.out.println("Success!");
            else
                System.out.println("Error.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileWriter fw = new FileWriter("E:/test20170929/abc/1.txt");
            //单独使用FileWriter操作字符，单独使用FileWriter操作字符，性能差 推荐fw2用法
            fw.write("this is a test ...");
            fw.close();
            System.out.println("file write ok.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bfw = new BufferedWriter(new FileWriter("E:/test20170929/abc/1.txt"));
        bfw.write("this is a test by bfw2");
        bfw.close();
        System.out.println("file2 write ok.");
        //这里的write操作 是覆盖操作。

        File file3 = new File("E:/test20170929/abc/2.txt");
        if(!file3.exists()){
            file3.createNewFile();
        }

        FileWriter fw3 = new FileWriter(file3);

        BufferedWriter bw3 = new BufferedWriter(fw3);
        String content = "this is  file3 ....";
        bw3.write(content);
        bw3.close();
        System.out.println("file3 write ok.");

        BufferedWriter bw2 = new BufferedWriter(new FileWriter("E:/test20170929/abc/3.txt"));
        bw2.write("this is file4 ...\r\n");//windows 换号符号就是  \r\n
        bw2.close();
        bw2 = new BufferedWriter(new FileWriter("E:/test20170929/abc/3.txt",true));//FileWriter 第二个参数就是append文本
        bw2.write("this is file4 addtion...\r\n");
        bw2.close();
        BufferedReader br = new BufferedReader(new FileReader("E:/test20170929/abc/3.txt"));
        System.out.println("file4 write ok.");
        String readString;
        while ((readString = br.readLine()) != null){
            System.out.println(readString);
        }
        br.close();
    }
}
