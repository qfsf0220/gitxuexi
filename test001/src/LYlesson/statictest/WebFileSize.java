package LYlesson.statictest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Administrator on 2017/9/11.
 */
public class WebFileSize {
    public static void main(String[] args) {
        int size;
        double sizek;
        URL url = null;
        try {
            url = new URL("https://avatars1.githubusercontent.com/u/13790508?v=4&s=460");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        URLConnection conn = null;
        try {
            conn = url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        size = conn.getContentLength();
        System.out.printf("文件大小:%.2fK",size/1024.0);
        try {
            conn.getInputStream().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
