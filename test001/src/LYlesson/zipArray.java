package LYlesson;

import test1220.demo1.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/9/8.
 */
public class zipArray {
    public static void main(String[] args) {
        String a[] ={"a","b","c"};
        String b[] ={"e","f","g"};
        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object []c = list.toArray();
        System.out.println(Arrays.toString(c));
    }
}
