/**
 * Created by qfsf on 2016/11/26.
 */
class stanrdclasstest{
    public String getstring(){
        return "getstring";
    }
    public void show(){
        System.out.println("show");
    }
    public void showyes(String name,int age){
        System.out.println(name+'-'+age);
    }
    public String showyesyes(String name1,String name2){
        return name1+name2;
    }
}


public class stanrdclasstest1126 {
    public static  void main(String []args){
        //创建对象
        stanrdclasstest s = new stanrdclasstest();
        //调用无参数无返回值方法
        s.show();
        //调用无参有返回值方法
        String aaa = s.getstring();
        System.out.println(aaa);
        //调用带参无返回值方法
        s.showyes("qf",27);
        //调用带参有返回值方法
        String a2 = s.showyesyes("qf","sf");
        System.out.println(a2);
    }

}
