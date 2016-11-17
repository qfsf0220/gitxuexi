import java.util.*;
public class breakbreak {
    public static void main(String[] args){
        //添加一个标签，（通常用于 如果有度层嵌套。break 标签名; 直接退出到标签循环。）
        //并且标签可以用于任何语句上 if  while 等。
        int aaa ;
        label:
        while (true){
            Scanner in = new Scanner(System.in);
            System.out.println("enter a number:");
            aaa= in.nextInt();
            if (aaa<0){
                System.out.println("要正数");
                break label;
            }
        
        }
        if(aaa>=0){
            System.out.printf("输入为%d\n",aaa);
        }
        else{
            System.out.printf("负数%d\nloop over\n",aaa);
        }

    }
}
