
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2018/3/16.
 */
public class TestOfSet {
    public List<lesson> lesson_set;

    public TestOfSet(){
        this.lesson_set = new ArrayList<lesson>();
    }

    public void fangfaAdd(){
        lesson l1 = new lesson("qf", "1");
        lesson_set.add(l1);

        lesson ll1 = (lesson) lesson_set.get(0);

        System.out.println("id:"+ll1.id+" name:"+ll1.name );

        lesson l2 = new lesson("sf", "2");
        lesson_set.add(1,l2);
        lesson ll2 = (lesson) lesson_set.get(1);
        System.out.println(ll2.getClass());
        System.out.println(ll2.id +":"+ ll2.name);


    }

    public static void main(String[] args) {
        TestOfSet tos = new TestOfSet();
        tos.fangfaAdd();
        List<String> strArraylist = new ArrayList<>();
        List<Integer> intArraylist = new ArrayList<>();
        Class csal =strArraylist.getClass();
        Class cial =intArraylist.getClass();

        if(csal.equals(cial)) {
            System.out.println("same");
        }

    }
}

class lesson{
    public String name;
    public String  id;
    public  lesson(String name,String id){
        this.name = name;
        this.id = id;
    }
}

class studentofSet{
    public String id ;
    public String name;
    public Set lesson;
    public studentofSet(String name,String id){
        this.id = id;
        this.name = name;
        this.lesson = new HashSet();//HashSet 是 Set接口的实现类
    }

}


class BoxNoGeneric{ // 泛型类//这里obj只能装入 String类型元素，无法使用其他类型元素，无法复用，这时需要用到泛型
    private String obj;

    public void setObj(String obj) {
        this.obj = obj;
    }

    public String getObj() {
        return obj;
    }
}

class BoxGenetic<T> {
    private T obj;

    public void setT(T t) {
        this.obj = obj;
    }

    public T getT() {
        return obj;
    }

    BoxGenetic<Integer> bg = new BoxGenetic<>();
    BoxGenetic<Boolean> bg2 = new BoxGenetic<>();
    BoxGenetic<Double> bg3 = new BoxGenetic<>();
}

interface Generator<T> {  //泛型接口
    public T testfunc();
}

class dointerface<T> implements Generator<T>{ //实现
    public T testfunc(){
        return null;
    }
}

class FruitGenerator implements Generator<String>{
    String[] fruits = new String[]{"a", "b", "c"};
    public String testfunc(){
        return fruits[1];
    }
}
//泛型方法。。。to be continue....

