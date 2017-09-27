package test170926;

/**
 * Created by Administrator on 2017/9/27.
 */
public class LabelTest {
    public static void main(String[] args) {
        String a = "aa bb cc dd";
        String b = "cc";
        boolean hascc = false;
        int maxint = a.length()-b.length();
        testlbl: for(int i =0;i<=maxint;i++){
            int length = b.length();
            int j=i;
            int k=0;
            while(length-- !=0){
                if(a.charAt(j++) !=b.charAt(k++)){
                    continue testlbl;
                }
            }
            hascc = true;
            break testlbl;
        }
        if(hascc){
            System.out.println("find b");
        }else {
            System.out.println("no b.");
        }
    }
}
