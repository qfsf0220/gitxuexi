package test1224;

/**
 * Created by qfsf on 2016/12/24.
 */
public class chouxianglei_demo {
    public static void main(String[] args) {
//        car cc = new policecar();
//        cc.sound();
//        cc = new amblance();
//        cc.sound();
        soundmaker  s =new soundmaker();
        car c = new policecar();
        s.laba(c);
        c = new amblance();
        s.laba(c);


    }
}

abstract  class car {
    abstract void sound();
}

class soundmaker{
    void    laba(car c){
        c.sound();
    }
}


class  policecar extends car{
    @Override
    void sound() {
        System.out.println("wua  wua");
    }
}

class amblance extends car{
    @Override
    void sound() {
        System.out.println("didu  didu");
    }
}