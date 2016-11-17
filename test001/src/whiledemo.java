public class whiledemo{
    public static void main(String[] args){
        //求1-100之间的和
        int sum = 0;
        for(int x=1;x<=100;x++){
            sum+= x;
        }
        System.out.println("sum:"+sum);
        System.out.println("-------------");
        //while
        int sum2 = 0;
        int y =1;
        while(y<=100){
            sum2+=y;
            y++;
        }
        System.out.println("sum2:"+sum2);
    }
}
