/**
 * Created by feng.qian on 2016/11/28.
 */
class box22{
    private double width;
    private double height;
    private double depth;

    public box22(){}

    double zhouchang(){
//        this.width=width;
//        this.height=height;
        return (width+height)*2;
    }

    public void setWDH(int width,int depth,int height){
        this.width=width;
        this.depth=depth;
        this.height=height;
    }


    double volume(){
        return width*height*depth;
    }
}

//constructor for box33
class   box33 {
    private double w;
    private double h;
    double d;

    //this is constructor for box33
    box33() {
        System.out.println("constructing box33..");
        w=10;
        h=20;d=30;
    }
    double volume(){
        return w*h*d;
    }
}

public class boxtest1128 {
    public static void main(String [] args){
        box22 b = new box22();
        b.setWDH(30,20,10);
        double vol1 = b.volume();
        double zc = b.zhouchang();
        System.out.println("volume is :"+vol1);
        System.out.println("zhouchang is :"+b.zhouchang());

        System.out.println("----------------");
        box33 b3 = new box33();
        System.out.println(b3.volume());
    }
}
