package test20180319;

import java.util.List;

/**
 * Created by Administrator on 2018/3/22.
 */
public class GuidelinesForWildcardUse {
    public static void main(String[] args) {
        System.out.println("通配符有三种使用方式 -" +
                "\n" +
                "上限通配符 - ? extends扩展类型。\n" +
                "下限通配符 - ? super超级类型。\n" +
                "无限通配符 - ?\n" +"\n"+
                "要确定哪种类型的通配符最适合条件，我们首先将传递给方法的参数类型作为in和out参数进行分类。\n" +
                "in变量 - in变量为代码提供数据。例如，copy(src，dest)。 这里src作为要复制的数据的变量。\n" +
                "out变量 - out变量保存由代码更新的数据。例如，copy(src，dest)。 这里的dest作为具有复制数据的变量。\n\n" +
                "通配符指南\n" +
                "上限通配符 - 如果变量属于类别，请使用带有通配符的extends关键字。\n" +
                "下界通配符 - 如果一个变量是外部类别，请使用带有通配符的super关键字。\n" +
                "无界通配符 - 如果可以使用Object类方法访问变量，则使用未绑定的通配符。\n" +
                "无通配符 - 如果代码访问进/出类别中的变量，那么不要使用通配符。);");
    }
}

