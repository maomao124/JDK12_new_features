package mao;

import java.util.Locale;
import java.util.function.Function;

/**
 * Project name(项目名称)：JDK12_new_features
 * Package(包名): mao
 * Class(类名): Test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/6
 * Time(创建时间)： 17:28
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test2
{
    public static void main(String[] args)
    {
        System.out.println("abc".transform(new Function<String, String>()
        {
            @Override
            public String apply(String s)
            {
                return s.toUpperCase(Locale.ROOT);
            }
        }));
        String result = "foo".transform(input -> input + " bar");
        System.out.println(result); // foo bar
    }
}
