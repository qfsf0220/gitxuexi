package test1207;
class uvwxyz {
    private Object x;
    private Object y;

    public void setX(Object x) {
        this.x = x;
    }
    public Object getX() {
        return x;
    }
    public void setY(Object y) {
        this.y = y;
    }
    public Object getY() {
        return y;
    }


}
public class fanxingtest01 {
    public static void main(String[]args){
        uvwxyz uu = new uvwxyz();
        uu.setX(10);
        uu.setY(20);
        int uux = (Integer) uu.getX();//成员装箱
        int uuy = (Integer)uu.getY();
        uu.setX(5.5f);
        uu.setY(9.9f);
        float uuxf=(Float) uu.getX();
        float uuyf=(Float) uu.getY();
//        String uuxs =(String) uu.getX();//如果两个类型不同的同时输出（这里 上面是 float 下面是String） 就会出现classcastexception错误 类型转换错误
//        String uuys =(String) uu.getY();
        System.out.println(uuxf+uuyf);
        System.out.println(uux+uuy);
        System.out.println(uux+uuy);
//解决这个类型转换错误就需要用到泛型




    }

}
