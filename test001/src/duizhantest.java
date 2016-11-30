/**
 * Created by feng.qian on 2016/11/29.
 */

class duizhant {
    int stck [] = new int[10];
    int tos;
    //initialize top-of-stack
    duizhant () {
        tos = -1;
    }
    //push an item onto the duizhan(stack)
    void push(int item){
        if (tos==0){
            System.out.println("stack is full");
        }else stck[++tos] = item;
    }
    //pop an item from the duizhan
    int pop(){
        if (tos <0){
            System.out.println("stack underflow");
            return 0;
        }else return stck[tos--];
    }
}


public class duizhantest {
    public  static void main(String[]args){
        duizhant dz1 = new duizhant();
        duizhant dz2 = new duizhant();
        //push some numbers onto the stack
        for(int i=0;i<10;i++) dz1.push(i);
        for (int i=10;i<20;i++) dz2.push(i);

        //pop those numbers off the stack
        System.out.println("stack in mystack1:");
        for (int i=0;i<10;i++){System.out.println(dz1.pop());}
        System.out.println("stack in mystack2:");
        for (int i=0;i<10;i++){System.out.println(dz2.pop());}
        

    }
}
