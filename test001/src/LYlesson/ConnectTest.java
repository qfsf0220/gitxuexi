package LYlesson;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by Administrator on 2017/9/11.
 */
public class ConnectTest {
    public static void main(String[] args)  {
        InetAddress addr ;
        Socket sock = null;
        try {
            sock = new Socket("qfsf0220.wang",50220);

        addr  = sock.getInetAddress();
        System.out.println("connect to "+addr +" ok");
        sock.close();
        }catch (IOException e){

            System.out.println(e);
        }

        try {
            InetAddress addr2 = new Socket("www.baidu.com",80).getInetAddress();
            System.out.println("connect to "+addr2+ " ok.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
