package test1207;

class fanxing<F>{
    private F num1;
    private F num2;

    fanxing(){};

    fanxing(F num1,F num2){
        this.num1=num1;
        this.num2=num2;
    }

    public F getNum1() {
        return num1;
    }

    F getNum2() {
        return num2;
    }

}

public class fanxingtest03 {
    public static void main(String [] args){
         fanxing<Integer> f = new fanxing<>(10,20);
//         f.setNum1(10);
//         int ff=f.getNum1();
//         System.out.println(ff);

        System.out.println(f.getNum1()+f.getNum2());
    }
}
