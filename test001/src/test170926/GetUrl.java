package test170926;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.print.DocFlavor;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.Buffer;

/**
 * Created by Administrator on 2017/9/30.
 */
public class GetUrl {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://qfsf0220.win");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            BufferedWriter bw = new BufferedWriter(new FileWriter("qfsf0220index.html"));
            String line;
            while ((line=br.readLine()) !=null ){
                System.out.println(line);
                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        GetUrl2 gu2 =new GetUrl2();
        try {
            System.out.println("---------------");
            gu2.geturl2();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


class GetUrl2 {
     void geturl2() throws IOException {
        URL url2 = new URL("http://qfsf0220.win");
        InputStream inputStream = url2.openStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
         while (bufferedReader.readLine() != null){
             System.out.println(bufferedReader.readLine());
         }
    }
}