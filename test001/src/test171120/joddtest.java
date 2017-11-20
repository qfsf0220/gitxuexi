package test171120;

/**
 * Created by Administrator on 2017/11/20.
 */

import javax.swing.*;
import  jodd.format.Printf;
public class joddtest {
    public static void main(String[] args) {
        testprint();
    }

    private static void testprint(){
        Printf.str("%04d", 1666);
        Printf.str("%f", 0.5);
    }
}
