package test20180319;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Administrator on 2018/3/20.
 */
public class GetMap {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<String, String>();
        GetMap gm = new GetMap();
        gm.putinfo(map1);
        gm.printinfo(map1);
    }


     void putinfo(Map map1){
         map1.put("1", "aa");
         map1.put("2", "ab");
         map1.put("3", "ac");
         map1.put("4", "ad");
    }
    void printinfo(Map map1){
         for (Object i : map1.keySet()) {
             System.out.println(i + "~~"+map1.get(i));
         }
    }

    void printinfo2(Map map1){
        Iterator<Map.Entry<String, String>> it = map1.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey()+"!!"+entry.getValue());
        }
    }

    void printinfo3(Map map1) {

    }
}
