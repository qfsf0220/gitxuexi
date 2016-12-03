package test1203;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by qfsf on 2016/12/3.
 * 方法的重载
 */

public class chongzaitest {
    public static void main(String[] args) {
         tell(8);
    }

    public static void tell(){
        System.out.println("tell");
    }

    public static void  tell(int i)
    {
        System.out.println("tellinti-"+i);
    }

    public  int tellInt(){
        return  1;
    }
    public int tellInt(int i){
        return i;
    }

}
