/**
 * Created by qf on 2016/12/29.
 */
public class string_test_1229 {
    public  static  void main(String []args){
        String str1 = "12345";
        String str2 = "hello boss";
        int i = Integer.parseInt(str1); //String to int
        System.out.println(i+11111);

        str1 = "123.456";     //String to Double
        System.out.println(Double.parseDouble(str1));

System.out.println("-----------");
        int a = 123;
        double b= 123.455;

        System.out.printf("%s::%s",String.valueOf(a),String.valueOf(b));//int  or double to String
        System.out.println("-----------");
        char []c =  str2.toCharArray();
        for(int j=0;j<c.length;j++){
            System.out.println(c[j]);
        }
    }


}
