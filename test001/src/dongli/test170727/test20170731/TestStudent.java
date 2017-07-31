package dongli.test170727.test20170731;
class Sellphone{
    String color;
    String type;
    byte disknum;
}

class Student {
    int id;
    String name;
    String address;
    Sellphone mobile;
}

public class TestStudent{
    public static void main(String[]args){
        Sellphone ip=new Sellphone();
        ip.color="black";
        ip.type="iphone7 plus";
        ip.disknum=64;

        Student s= new Student();
        s.address="南方";
        s.id=1;
        s.name="张总";
        s.mobile= ip;
        System.out.println(s.name+"的"+s.mobile.type);
    }

}