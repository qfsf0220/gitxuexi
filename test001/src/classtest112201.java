/**
 * Created by feng.qian on 2016/11/22.
 */
class box {
    double width;
    double height;
    double depth;
}


class box2 {


}

public class classtest112201 {
    public static void main(String args[]){
        box bb= new box();

        box bb2 = new   box();

        bb.height=10;
        bb.width=10;
        bb.depth=5.5;

        bb2.depth=9;
        bb2.width=9;
        bb2.height=2.5;

        double tiji = bb.depth*bb.height*bb.width;
        double tiji2 = bb2.depth*bb2.height*bb2.width;
        System.out.println("tiji is :"+tiji);
        System.out.println("tiji2 is :"+tiji2);
    }

}
