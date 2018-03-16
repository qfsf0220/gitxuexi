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
