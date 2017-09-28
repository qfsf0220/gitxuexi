package test170926;

import java.util.Calendar;

/**
 * Created by Administrator on 2017/9/27.
 */
public class EnumTest {
    enum Car {
        hondaq("a"), audiq("a"), buickq("b"),honda(10), audi(15), buick(8),hyundai(1);
        private int price;
        private  String x;
        Car(String p){
            x=p;
        }
        Car(int p){
            price=p;
        }
        int getPrice(){
            return price;
        }
        String getType(){
            return x;
        }
    }
    public static void main(String[] args) {
         for (Car c:Car.values()){
             if(c.getPrice()>=5)
             System.out.println(c +" "+c.getPrice());
//             System.out.println(c +" "+c.getType());
         }
    }
}
