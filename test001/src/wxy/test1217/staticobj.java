package wxy.test1217;

import com.sun.xml.internal.rngom.digested.DEmptyPattern;

/**
 * Created by qf on 2016/12/17.
 */
public class staticobj {
    static int sum(int x,int y ){
        return  x+y;
    }
public static void main(String[] args){
        int sum = staticobj.sum(20,30);
    System.out.printf("sum="+sum);
}


}
