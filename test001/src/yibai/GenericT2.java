package yibai;

/**
 * Created by Administrator on 2017/9/12.
 */
public class GenericT2 {
    public   static  <E> void  printArray(E[] inputArray){
        for (E element:inputArray){
            System.out.printf("%s ",element);
        }
    }

    public static void main(String[] args) {
        Integer [] intArray={1,2,3,4,5,6,7};
        Double [] doubleArray ={1.1,2.2,3.3,4.4,5.5};
        Character [] charArray={'a','b','c','d','e'};

        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);

    }

}
