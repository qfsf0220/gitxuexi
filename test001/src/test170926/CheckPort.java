package test170926;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by Administrator on 2017/9/29.
 */
public class CheckPort {
    public static void main(String[] args)  {
        Socket sock1;
        String host = "192.168.137.134";

        for (int i =20;i<30;i++){
            try {
                System.out.println("check:"+i);
                sock1 = new Socket(host, i);
                System.out.println("port "+i+" of "+host+" is on");
            } catch (ConnectException e) {
                System.out.println("port"+i+" is close.");

            }catch (IOException e){
            }

        }

    }
}
