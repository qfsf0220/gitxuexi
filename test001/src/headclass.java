//import java.math.*;

/**
 * Created by feng.qian on 2016/11/22.
 *  this is a test
  */


class Dog{
    int size;
    String name = "shasha";
    boolean breed = true;

    void  bark(){
        System.out.println("dog dog");
    }
}

public class headclass {
    public  static  void main(String [] args){
        Dog dd = new Dog();
        int dogsize = dd.size=40;
        dd.bark();
        String name =dd.name;
        boolean breed = dd.breed;
        System.out.println(dogsize);
        System.out.printf("dog's name %s,%b\n",name,breed);
        int ra =(int) (Math.random()*10);
        System.out.println(ra);
    }
}
