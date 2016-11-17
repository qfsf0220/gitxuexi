import java.util.Scanner;
public class rawinput{
    public static void main (String [] args){
        Scanner s= new Scanner(System.in);
        System.out.println("How old are you?");
        
            int line = s.nextInt();
            int year = 2016-line;
            System.out.println(" You birth in "+ year);
            
        

    
    }

}
