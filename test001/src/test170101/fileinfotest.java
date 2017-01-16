package test170101;


import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * Created by qf on 2017/1/1.
 */
public class fileinfotest {
    public static void main(String []args) throws IOException {
        //文件操作
        File ff = new File("/Users/qf/Downloads/android-sdk-macosx/skins/nexus_5x/layout");
        System.out.println(ff.getName());
        System.out.println(ff.getAbsolutePath());
        System.out.println(ff.length());

        File f2 = new File("/Users/qf/test","test.txt");
        File f3 = new File("/Users/qf/test","test2.java");
        File f4 = new File("/Users/qf/test","test3.java");

        if (!f2.exists()){
            try {
                f2.createNewFile();
                System.out.println("创建文件ok！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        f4.createNewFile();

        try {
            f3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        f2.delete(); //这里是删除文件
        //目录操作

        File d3 = new File("/Users/qf/test/testdir");
        d3.mkdir();//还有mkdirs方法 等于mkdir -p
        //列出目录中的文件
//        public String[] list();//用字符串形式返回目录下文件
//        public File [] listFiles();//用File对象形式返回目录下的文件
//        public String[] list(FilenameFilter obj);//用字符串形式返回目录下的 指定类型 文件
//        public File[] listFiles(FilenameFilter obj);//用file对象形式返回目录下的指定类型文件、

File f5 = new File("/Users/qf/test");

        filecheck fc = new filecheck();

        String[] filemingzi = f5.list(fc); //通过fc的方法 list过滤 f5

        if (filemingzi != null) {
            for(int i =0;i<filemingzi.length;i++){
                System.out.println(filemingzi[i]);
            }
        }


    }
}
class filecheck implements FilenameFilter{//过滤java结束的文件

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith("java");
    }
}