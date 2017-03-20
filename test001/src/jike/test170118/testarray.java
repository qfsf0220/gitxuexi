package jike.test170118;

/**
 * Created by qf on 2017/1/18.
 */
public class testarray {
    public static void main(String []args){
        CupSizet cz = new CupSizet();
        cz.size=CupSizet.CupSize2.large;
        System.out.println("Size:"+cz.size);

    }
}

class CupSizet{
    enum CupSize2 { small, medium,large}
    CupSize2 size;
}