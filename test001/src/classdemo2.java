/**
 * Created by qfsf on 2016/11/26.
 *  定义 求 周长 和面积的方法
 *
 */
import  java.util.Scanner;//注意 import 需要出现在所有class 前面
class classdemo{
    private int length;
    private int width;

    public classdemo(){};

    public void setLength(int length){
        this.length=length;
    }
    public  void setWidth(int width){
        this.width=width;
    }
    //求周长
    public int getzhouchang(){
        return length+width+length+width;
    }
    public int getarea(){
        return length*width;
    }
}

public class classdemo2 {
    public  static  void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("长是？");
        int chang =in.nextInt();
        System.out.println("宽是？");
        int kuan =in.nextInt();
        classdemo d = new classdemo();
        d.setLength(chang);
        d.setWidth(kuan);
        System.out.println("面积是："+d.getarea());
        System.out.println("周长是："+d.getzhouchang());
    }
}
