package test20180319;

import test1220.demo1.demo1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Administrator on 2018/3/22.
 */
public class LowerBoundWildcards {
    public static void addCat(List<? super Cat> catList){
        catList.add(new RedCat());
        System.out.println("Cat add");
    }
    //问号(?)表示通配符，代表未知类型的泛型。 有时候您可能希望限制允许传递给类型参数的类型。 例如，对数字进行操作的方法可能只需要接受Integer或其超类的实例，例如Number类的实例。 要声明一个下限通配符参数，在问号?后跟super关键字，最后跟其下界。

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        List<Cat> catList = new ArrayList<>();
        List<RedCat> redCatList = new ArrayList<>();
        List<Dog> dogList = new ArrayList<>();

        addCat(animalList);
        addCat(catList);
//        addCat(redCatList);// can not add list of subclass RedCat of Cat class
//        addCat(dogList); //can not add list of subclass Dog of Superclass Animal of Cat class

    }

}


class Animal{}

class Cat extends Animal{}

class RedCat extends Cat {}

class Dog extends Animal{}
