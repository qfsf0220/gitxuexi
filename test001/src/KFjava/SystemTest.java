package KFjava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by Administrator on 2017/10/17.
 */
public class SystemTest {
    public static void main(String[] args) throws IOException {
        Map<String, String> env = System.getenv();
        for (String i : env.keySet()) {
            System.out.println(i + " -> " + env.get(i));
        }
        System.out.println(System.getenv("JAVA_HOME"));
        System.out.println(System.getProperty("os.name"));

        Properties pt =System.getProperties();
        pt.store(new FileOutputStream("E://props.txt"),"System Properties");


    }


}
