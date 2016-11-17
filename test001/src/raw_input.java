import  java.util.*;

public class raw_input{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = in.nextLine();
        System.out.println("enter your age");
        int age = in.nextInt();
        System.out.println("enter a float number");
        double fudianshu = in.nextDouble();
        System.out.println("------------------\n");
        System.out.printf("Hello %s, your are %d years old.the float number  you enter is %,10.2f\n",name,age,fudianshu);
    }
}
