import java.util.Arrays;

public class JavaGrammar {
    public static void main(String[] args) {
        JavaGrammar jg = new JavaGrammar();
        jg.operateArrays();
        jg.arraystostr();
        jg.foreach();
        jg.morearrays();
    }

    void operateArrays(){
        int[] array1 = {1234, 234, 332, 54234, 35};
        Arrays.sort(array1);
        for (int i:array1){
            System.out.println(i);
        }
    }

    void arraystostr(){
        int[] array1 = new int[]{123, 34, 234, 345, 32};
        System.out.println(Arrays.toString(array1).split(" "));
        for(String i :Arrays.toString(array1).split(" ")){
            System.out.println(i);
        }
    }

    void foreach(){
        int[] array1 = {2134234, 234, 234, 345, 34};
        Arrays.sort(array1);
        int xb = 0;
        for (int i:array1){

            System.out.printf("array1[%d] --%s\t",xb,i);
            xb++;
        }
        System.out.println();
    }

    void morearrays(){
        int[][] arrays1 = new int[2][3];// [2] hangshu [3]lieshu
        arrays1[0][0]=123;//first hang first lie yuansu shi 123
        int[][] arrays2 = {{2,3,5},{7,8,6}};
        for (int i =0;i<arrays2.length;i++){
            for (int j=0;j<arrays2[i].length;j++){
                System.out.print(arrays2[i][j]);
            }
            System.out.println();
        }
    }

}
