package KFjava.test20170428;

import javax.xml.crypto.Data;

/**
 * Created by Administrator on 2017/5/2.
 */
class DataWarp{
    int a;int b;
}
public class ReferenceTranserTest {
    public static void swap(DataWarp dw){
        int tmp=dw.a;
        dw.a=dw.b;
        dw.b=tmp;
        System.out.println("swap里 a:"+dw.a+"b:"+dw.b);
    }

    public static void main(String[]args){
        DataWarp dw = new DataWarp();
        dw.a=6;
        dw.b=15;
        swap(dw);
        System.out.println("交换后  a:"+dw.a+ " b:"+dw.b);
    }
}
