package yibai.InterfaceTest;

/**
 * Created by Administrator on 2017/10/9.
 */
public class InterfaceTest {
    public static void main(String[] args) {
        Squre s = new Squre();
        s.draw();
    }
}

interface Shape{
    void draw();
}
//接口作为 参数类型。
class Main{
    private Shape myShape;

    public Main(Shape myShape){
        this.myShape= myShape;
    }
    public  Shape getMyShape(){
        return this.myShape;
    }

    public void setMyShape(Shape myShape) {
        this.myShape=myShape;
    }

    public void letswim(){
        Shape localshap = null;
        localshap = this.myShape;
        localshap.draw();
    }
}
class Squre implements  Shape{
    public void draw(){
        System.out.println("draw squre");
    }
}
