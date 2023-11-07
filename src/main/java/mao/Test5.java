package mao;

/**
 * Project name(项目名称)：JDK12_new_features
 * Package(包名): mao
 * Class(类名): Test5
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/7
 * Time(创建时间)： 10:40
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test5
{
    public static void main(String[] args)
    {
        Object o = "hello";
        if (o instanceof String)
        {
            String str = (String) o;
            System.out.println(str);
        }
        if (o instanceof String str)
        {
            System.out.println(str);
        }
    }
}
