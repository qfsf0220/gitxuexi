package LYlesson.changfangxing;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/4.
 */
class info{
    private int length;
    private int width;
    public info(){}
    public void setLength(int length) {
        this.length = length;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int printzhouchang(){
        return (width+length)*2;
    }
    public  int printmianji(){
        return (width*length);
    }
}

public class changfangxinginfo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("input length:");
        int l = s.nextInt();
        System.out.print("input width:");
        int w = s.nextInt();
        info i = new info();
        i.setLength(l);
        i.setWidth(w);
        System.out.println("周长:"+i.printzhouchang());
        System.out.println("周长:"+i.printmianji());
    }
}
