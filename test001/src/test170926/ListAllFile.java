package test170926;

import java.io.File;
import java.io.FileReader;

/**
 * Created by Administrator on 2017/9/29.
 */
public class ListAllFile {
    public static void main(String[] args) {
        String pathname = "E:\\test20170929";
        File f = new File(pathname);
        String absolutePath = f.getAbsolutePath();
        System.out.println(absolutePath);
        File absoluteFile = f.getAbsoluteFile();
        System.out.println(absoluteFile);

        File fen = new File(pathname);
        File[] flist = fen.listFiles();
        for (File i: flist){
            if(i.isDirectory()){
                File[] subfilelist = i.listFiles();
                for (File si :subfilelist){
                    if(si.isDirectory()){
                        File[] subsub = si.listFiles();
                        for (File ssi:subsub){
                            System.out.println(ssi);
                        }
                    }else System.out.println(si);
                }
            }else{
                System.out.println(i);
            }
        }

    }
}
