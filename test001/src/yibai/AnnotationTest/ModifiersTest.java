package yibai.AnnotationTest;


import java.lang.annotation.Annotation;

/**
 * Created by Administrator on 2017/10/10.
 */
public class ModifiersTest {
    public static void main(String[] args) {

        Class<Info> object = Info.class;
        Annotation[] aaa = object.getAnnotations();
        for (Annotation i :aaa){
            System.out.println(i);
        }

    }
}
@interface Info{
    String Name();
    String Job() default "yunwei";
}
@Info(Name="zhangzong",Job="yunwei")
class InfoPrint{
    @Info(Name="yangzong")//这里Job是有默认值的 所以可以不用写。
    public void amethod(){}
}
@interface MyAnnotation{
    byte a();short b();int c();long d();float e();double f();boolean g();char h();
}