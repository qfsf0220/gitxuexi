package test170926;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/29.
 */
public class FileAct2 {
    public static void main(String[] args) {
        String filename = "E:\\test20170929\\abc\\2.txt";
        File file = new File(filename);
        if(file.exists()){
            System.out.println("<"+filename +">"+" will be delete...");
            Scanner sc = new Scanner(System.in);
            System.out.println("are you ok?(y/n)");
            String line =sc.nextLine();
            if(line.equals("y")){
                file.delete();
            }
            System.out.println("delete ok.");
        }else System.out.println(filename +" is not exists.");
//del dir
        String dirname = "E:\\test20170929\\abc";
        File f = new File(dirname);
        boolean a = f.isDirectory();
        System.out.println(a);
        if (a){
            String [] subfile =f.list();
            for (String fileindir :subfile){
                System.out.println(fileindir +" will delete");
                new File(dirname+"\\"+fileindir).delete();
            }
        }
        f.delete();
    }
}
