package test20180319;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by Administrator on 2018/3/20.
 */
public class ParameterizedTypes {
    public static void main(String[] args) {
//        Box4<Integer, List<String>> box = new Box4<Integer,List<String>>();
        Box4<Integer, List<String>> box = new Box4<>();
        List<String> lista = new ArrayList<>();
        lista.add("qoo");lista.add("fo");lista.add("good");
        box.setTS(1,lista);
        System.out.println(box.getT() +"~~"+ box.getS());
    }
}
class Box4<T,S>{
    private T t;
    private S s;

    void setTS(T t,S s){
        this.t = t;
        this.s = s;}

    public S getS() {return s;}
    public T getT(){return t;}
}