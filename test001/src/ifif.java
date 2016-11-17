import java.util.*;
public class ifif{
    public static void main(String [] args){
        for(int i = 1;i<=10;i++){
            if (i==6){
                continue;
            }
                System.out.println(i);
        }
        Scanner in = new Scanner(System.in);
        System.out.println("enter a numbr:(1-10)");
        int aa = in.nextInt();
        if (aa>5 && aa<10){
            System.out.println("big");
        }
        else if (aa>10){
            System.out.println("so big");
        }
        else {
            System.out.println("normal");
        }
    }
}
