package heima.test20170730;

public class FunctionTest001 {
    public static void main(String[]args) {
        FunctionTest001.tree(7);
        print9x9();
    }
    private   static void tree(int a){
        for(int x = 0;x < a;x++){
            for(int y = a-1;y>x;y--){
                System.out.print(" ");
            }

            for (int z =0;z<=x;z++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void print9x9(){
        for (int x=1 ;x<=9;x++){
            for (int y=1 ;y<=x;y++){
                System.out.print( y+"x"+x+"="+x*y+"\t");
            }
            System.out.println();
        }
    }


}


