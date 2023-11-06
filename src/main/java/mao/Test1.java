package mao;

/**
 * Project name(项目名称)：JDK12_new_features
 * Package(包名): mao
 * Class(类名): Test1
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/6
 * Time(创建时间)： 17:26
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test1
{
    public static void main(String[] args)
    {
        String text = "Java";
        // 缩进 4 格
        System.out.println(text);
        text = text.indent(4);
        System.out.println(text);
        text = text.indent(8);
        System.out.println(text);
        text = text.indent(2);
        System.out.println(text);
        text = text.indent(1);
        System.out.println(text);
        text = text.indent(0);
        System.out.println(text);
        text = text.indent(-10);
        System.out.println(text);
    }
}
