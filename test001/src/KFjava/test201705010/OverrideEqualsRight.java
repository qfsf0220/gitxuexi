package KFjava.test201705010;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

/**
 * Created by Administrator on 2017/5/10.
 */
class Person{
    private String name;
    private String id;
    public Person(){};
    public Person(String name,String id){
        this.name =name;
        this.id = id;
    }

    public void setId(String id) {this.id = id;}
    public String getId() {return id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if(obj !=null && obj.getClass() ==Person.class){
            Person p =(Person)obj;
            if(this.getId().equals(p.getId())){
                return true;
            }
        }
        return false;
    }
}

public class OverrideEqualsRight {
    public static void main(String[]args){
        Person p1 = new Person("qf","12345");
        Person p2 = new Person("qf2","34567");
        Person p3 = new Person("qf3","56789");
        System.out.println("p1=p2?:"+p1.equals(p2));
        System.out.println("p2=p3?:"+p2.equals(p3));

    }
}
