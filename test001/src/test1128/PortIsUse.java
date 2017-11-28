package test1128;

import com.sun.org.apache.xpath.internal.SourceTree;
import sun.swing.icon.SortArrowIcon;

import java.net.*;
import java.io.*;
/**
 * Created by Administrator on 2017/11/28.
 */
public class PortIsUse {
    public static void main(String[] args) {
        Socket sjt;
        String host = "localhost";

        for (int i = 3386 ;i<3390;i++){
            try {
                System.out.println("look for "+i);
                sjt = new Socket(host, i);
                System.out.println("there is a server on port "+i+" of "+host);
            } catch (IOException e) {
                System.out.println("不通。");
            }
        }
        portinfo(new int[] {3389,12345,3245,8666});
    }

    static void portinfo(int ...intArrays){
        for (int a :intArrays) {
            try {
                Socket s = new Socket("localhost", a);
                System.out.println(a + " is ok");

            } catch (IOException e) {
                System.out.println(a+" error");
            }
        }
    }
}
