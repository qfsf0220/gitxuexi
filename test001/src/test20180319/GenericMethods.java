package test20180319;

/**
 * Created by Administrator on 2018/3/20.
 */
public class GenericMethods {
    public static <V> void printArray(V[] inputArray){ //generic method printArray
        for(V i :inputArray){
            System.out.printf("%s ",i);
        }
        System.out.println();
    }

    static <V> void test123(V i){
        System.out.println(i);
    }
    public static void main(String[] args) {
        printArray(new Integer[] {1,3,4,5,4});
        printArray(new String[] {"e","e","q","c"});printArray(new Character[]{'你','2','3'});

        test123(2123+"也要"+'v');
    }


}
