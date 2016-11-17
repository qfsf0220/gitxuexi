public class argsargs {
    public static void main(String[] args){
        if (args[0].equals("-h")){
            System.out.print("hello");
        }
        else if (args[0].equals("-g")){
            System.out.print("goodbye.");
        }
        for (int i = 1;i<args.length;i++){
            System.out.print(" "+args[i]);
            System.out.println("!");
        }
    }
}
