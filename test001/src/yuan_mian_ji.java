import java.util.*;
class yuan_mian_ji{
    public static void main(String[] args){
        double pi,a;
        System.out.println("this circle long is:");
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        //r= 10.8;
        pi=3.14159265;
        a= pi*r*r;
        System.out.printf("the area of this circle is %f\n",a);
    }
}
