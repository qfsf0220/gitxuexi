package test1222;

/**
 * @author feng.qian
 * @create at 2016-12-22 11:35
 */


public class chongzaitest {
    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.setBanjin(10);

        Ladder lad = new Ladder(5,6,7);

        caozuo cz = new caozuo();
        double cirarea = cz.jisuan(cir);

        double ladarea = cz.jisuan(lad);
        System.out.println("圆面积:"+cirarea + " 梯形面积："+ladarea);
    }
}


class Circle{
    double banjin,mianji;

    void setBanjin(double banjin){
        this.banjin=banjin;
    }

    double getarea(){
        mianji =  3.14*banjin*banjin;
        return mianji;
    }
}

class Ladder{
    double top,bottom,height;

    //这里设置一个有参的构造方法,通过构造方法传参
    public Ladder(double top,double bottom,double height){
        this.bottom=bottom;
        this.top=top   ;
        this.height= height;
    }
    double getarea(){
        return (bottom+top)*height/2;
    }

}

class caozuo{
    double jisuan(Circle casd){
        return casd.getarea();
    }
    //这里用到方法的重载,重载 需要一个类中有多个方法具有相同的名字，但这些方法的参数必须不同，或者 参数个数不同，或者参数类型不同。
    double jisuan(Ladder lada){
        return lada.getarea();
    }

}