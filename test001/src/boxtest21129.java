/**
 * Created by feng.qian on 2016/11/29.
 */
class boxtest2{
    int width;
    int height;
//    boxtest2(){};

//    public void setWidth(){this.height=height;}
//    public void setHeight(){this.width=width;}
    public int chang(){
        return width+height;
    }
}

class boxtest22{
    double width;
    double height;

    boxtest22(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double chang2(){
        return 2 * (width + height);
    }
}

public class boxtest21129 {
    public static void  main(String [] args){
        boxtest2 bt2 = new boxtest2();
        bt2.height = 10;
        bt2.width=10;
        System.out.println(bt2.chang());
        System.out.println("-------------");

        boxtest22 bt22 = new boxtest22(20,20);
        double c22 = bt22.chang2();
        System.out.println(c22);
        System.out.println("");

    }
}
