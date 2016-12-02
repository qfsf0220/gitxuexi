/**
 * box 类 with 继承
 *
 * @author feng.qian
 * @create at 2016-12-02 14:40
 */

//this program uses inheritance to entend box
class jcbox{
    double width;
    double height;
    double depth;

    jcbox(double w,double h,double d ){
        width=w;
        height=h;
        depth=d;
    }

    jcbox(){
        width=-1;
        height=-1;
        depth  = -1;
    }

    jcbox(double len) {
        width = height = depth = len;
    }
    double volume(){
        return width*height*depth;
    }
    }

    //box is extend to include weight
    class boxweight extends jcbox{
        double weight;


    boxweight(double w,double h,double d,double m){
        width=w;
        height=h;
        depth = d;
        weight=m;
        }
    }

public class jichengtest21202 {
    public static void main(String[] args) {
        boxweight bw = new boxweight(1,2,3,4);
        boxweight bw2 = new boxweight(2,3,4,5);

        double vol = bw.volume();
        System.out.println("vol:"+ vol);
        System.out.println("weight:"+ bw.weight);
    }
}
