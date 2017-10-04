/**
 * Created by qfsf on 2017/10/4.
 */
public class concept {
    public static void main(String[] args) {
        Overload ol = new Overload();
        ol.p1(1);
        ol.p1("1");
        ol.p1("1",1);
    }
}

class Overload{
    public  void p1(String a){
        System.out.println("String " +a);
    }

    public  void p1(int a){
        System.out.println("int "+a);
    }

    public  void p1(String a,int b){
        System.out.println("Sting "+a+" int "+b);
    }

}
