package test170926;

/**
 * Created by Administrator on 2017/9/28.
 */
public class VarargsWithMehtodTest {
    public static void main(String[] args) {
        int[] aa = {1,2,3,4};
        int sum2 = sumargs(aa);
        int sum = sumargs(new int[]{1, 2, 3, 4});
        System.out.println(sum);
        System.out.println(sum2);
    }

    static int sumargs(int... intarrays){
        int sum,i;
        sum=0;
        for (i=0;i<intarrays.length;i++){
            sum += intarrays[i];
        }
        return sum;
    }
}
