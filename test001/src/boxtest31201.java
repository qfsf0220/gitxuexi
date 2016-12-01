/**
 * thisisa test for reload use obj init obj
 *
 * @author feng.qian
 * @create at 2016-12-01 14:16
 */
class box3{
    double width;
    double height;
    double depth;
//    notice this constructor  it takes an object of type box
    box3(box3 ob){
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }
    box3(double width ,double h,double d){
        depth=d;
        height=h;
        this.width=width;
    }

    box3(){
        width=-1;
        height=-1;
        depth=-1;
    }
    box3(double len){
        width=height=depth=len;
    }
    double volume(){
        return width*height*depth;
    }

}

public class boxtest31201 {
    public static void main(String[] args) {
        box3  b1 = new box3(10,20,30);
        box3 b2 = new   box3();
        box3 b3 = new box3(7);

        box3 mybox = new box3(b1);
        double vol ;
        vol = b1.volume();
        System.out.println("体积是："+vol);
        vol =b2.volume();
        System.out.println("tiji2:"+vol);
        vol =mybox.volume();
        System.out.println("tijiclone"+vol);
    }
}
