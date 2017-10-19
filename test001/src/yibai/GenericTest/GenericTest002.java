package yibai.GenericTest;

/**
 * Created by Administrator on 2017/10/19.
 */
public class GenericTest002 {
    public static void main(String[] args) {
        Integer [] intArray ={1,2,34,4,5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'a', 'b', 'd', 'f', 'e'};

        priArray(charArray);

        priArray(intArray);
        priArray(doubleArray);
    }
    static <E>void priArray(E[] inputArray){
        for (E element: inputArray){
            System.out.printf("%s ",element);
        }
        System.out.println();
    }

}
