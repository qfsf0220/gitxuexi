public class forfor{
    public static void main (String[] args){
        for (int i=10;i>=0;i-=2){
            System.out.println(i);
        }
        System.out.println("----------");
        int sum =0;
        for (int j =0;j<=100;j++){
            sum += j;
        }

            System.out.printf("the sum is %d\n",sum);
    }
}
