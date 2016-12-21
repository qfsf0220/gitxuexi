package test1221;

/**
 * @author feng.qian
 * @create at 2016-12-21 11:30
 */


public class kebiancanshutest {
    public static void main(String[] args) {
        sum(1111,333,444);

    }
    static int sum(int...x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum+=x[i];
        }
        return sum;
    }


}
