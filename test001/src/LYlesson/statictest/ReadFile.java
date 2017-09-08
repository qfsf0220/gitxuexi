package LYlesson.statictest;

import java.io.*;

/**
 * Created by Administrator on 2017/9/8.
 */
public class ReadFile {
    public static void main(String[] args) throws IOException {
        FileReader fr= new FileReader("g:\\config.ini");
        BufferedReader in = new BufferedReader(fr);
        String x;
        while ((x = in.readLine()) != null){
            System.out.println(x);
        }

    }
}
