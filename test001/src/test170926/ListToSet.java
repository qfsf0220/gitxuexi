package test170926;

import KFjava.test20170523.ParametersTrans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/9/29.
 */
public class ListToSet {
    public static void main(String[] args) {
        String[] lista = {"aa", "bb", "cc", "dd","aa"};


        List<String> list = Arrays.asList(lista);
        for (String a : list) {
            System.out.print(a);
        }
    }
}
