package dongli.test170727.test20170731;

public class sanjx {
    public static void main(String []args){
        sjx(4);
    }
    static void sjx(int a){
        for(int x=1;x<=a;x++) {
            for(int y =a-1;y>=x;y--){
                System.out.print(" ");
            }
            for (int z=1;z<=x;z++){
                System.out.print("* ");
            }
            System.out.println();
            }
        for (int i =1;i<=2;i++){
            for (int j =1 ;j<=a-2;j++){
                System.out.print(" ");
            }
            System.out.print("* *");
            System.out.println();
        }
    }
    }

