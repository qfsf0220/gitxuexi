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
            url = new URL("https://gss1.bdstatic.com/9vo3dSag_xI4khGkpoWK1HF6hhy/baike/w%3D268%3Bg%3D0/sign=24010b0953da81cb4ee684cb6a5db72b/e850352ac65c1038da2c2d3fb0119313b17e89f9.jpg");
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
