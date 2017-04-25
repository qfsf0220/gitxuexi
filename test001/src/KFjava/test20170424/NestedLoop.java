package KFjava.test20170424;

/**
 * Created by Administrator on 2017/4/25.
 */
public class NestedLoop {
    public  static void main (String args []){
        for(int i= 0;i <10;i++){
            for (int j =0;j<10;j++){
                if (i==3 || i==4||i>6){
                    if (j>5){
//                        if (i==7) {
//                            continue;
//                        }
                       break;
                    }
                    if (i==7)
                        continue;
                    System.out.println("i:" + i + " j:" + j);
                }

            }

        }

    }
}
