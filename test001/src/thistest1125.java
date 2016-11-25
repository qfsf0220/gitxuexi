import javax.naming.BinaryRefAddr;

/**
 * Created by qfsf on 2016/11/25.
 */
class phone{
    private int price;
    private String color;

    //getxx() and setxx() function
    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color= color;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price=price;
    }

}


public class thistest1125 {
    public static void main (String[]args){
        phone pp = new phone();
        pp.setColor("blue");
        pp.setPrice(9999);
        System.out.println(pp.getColor()+'-'+pp.getPrice());

    }
}
