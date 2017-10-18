package KFjava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

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
//        pt.store(new FileOutputStream("E://props.txt"),"System Properties");

        Map<Integer, String> stringMap = new HashMap<>();
        stringMap.put(1, "aa");
        stringMap.put(2, "bb");
        stringMap.put(3, "cc");
        stringMap.put(4, "dd");
        stringMap.put(5, "ee");

        System.out.println(stringMap.get(0));
        Iterator<Integer> stringIterator = stringMap.keySet().iterator();
    }


}
