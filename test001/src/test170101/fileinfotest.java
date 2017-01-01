package test170101;


import java.io.File;
import java.io.IOException;

/**
 * Created by qf on 2017/1/1.
 */
public class fileinfotest {
    public static void main(String []args){
        File ff = new File("/Users/qf/Downloads/android-sdk-macosx/skins/nexus_5x/layout");
        System.out.println(ff.getName());
        System.out.println(ff.getAbsolutePath());
        System.out.println(ff.length());

        File f2 = new File("/Users/qf/test","test.txt");
        if (!f2.exists()){
            try {
                f2.createNewFile();
                System.out.println("创建文件ok！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        f2.delete(); //这里是删除文件

    }
}
