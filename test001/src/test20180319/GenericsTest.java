package test20180319;

import KFjava.test20170425.Num2Rmb;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/19.
 */
public class GenericsTest {
    //泛型方法11111 printArray
    public static <E> void  printArray( E[] inputArray) {
        for (E i : inputArray) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intarray = {123, 3, 4, 3, 5,};
        String[] strarray = {"qr", "fd", "gtr", "qwe"};
        Character[] chararray = {'E', 'F', 'G', 'H'};

        printArray(intarray);
        printArray(chararray);

        System.out.println("--------");
        Integer a = 1111;
        Integer b = 123;
        System.out.println(a.compareTo(b));
        MaxTest mt = new MaxTest();
        mt.getmax('1','X' , '我');

        Box<String> bgeneric = new Box<>();
        bgeneric.addinfo("box1");
        System.out.println(bgeneric.getT());

        GenericRegular gr = new GenericRegular();
        gr.getData();
    }

}

class MaxTest{
    //泛型方法22222 getmax
        public  static <T extends Comparable<T>> void  getmax(T x,T y ,T z) {
            T max = x;
            if (y.compareTo(max) >0){
                max = y;
            }
            if (z.compareTo(max)>0){
                max = z;
            }
            System.out.println("max:"+max);
        }
}

class Box<T>{
    //泛型类
    private T t;
    public void addinfo(T t){
        this.t = t;
    }
    public T getT(){
        return t;
    }
}

class GenericRegular {

    static void getData() {
        List<String> name = new ArrayList<>();
        List<Integer> age = new ArrayList<>();
        List<Number> num = new ArrayList<>();

        name.add("a");
        age.add(5);
        num.add(123);

        getData(name);
        getData(age);
        getData(num);
    }

    static void getData(List<?> data) {
        System.out.println("data:" + data.get(0));


    }
}


