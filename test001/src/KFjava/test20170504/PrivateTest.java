package KFjava.test20170504;

/**
 * Created by Administrator on 2017/5/4.
 */
public class PrivateTest {
    private String name;
    private int age;
    private static String name2;
    public void setName(String name){
        if(name.length() >6 || name.length()<1 ){
            System.out.println("out of range");
            return;
        }else{
            this.name=name;
            name2=name2;
        }
    }
    public  String getName(){
        return this.name;
    }
    public void setAge(int age){
        if(age>100||age<0){
            System.out.println("age is out of range");
            return;
        }else{
            this.age=age;
        }
    }
    public int getAge(){
        return this.age;
    }

    public static void main(String[]args){
        PrivateTest pd=new PrivateTest();
        pd.setName("qf");
        System.out.println(pd.getName());
        pd.setAge(28);
        System.out.println(pd.getAge());
    }


}
