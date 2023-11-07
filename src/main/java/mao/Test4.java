package mao;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Project name(项目名称)：JDK12_new_features
 * Package(包名): mao
 * Class(类名): Test4
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/6
 * Time(创建时间)： 22:15
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test4
{
    public static void main(String[] args)
    {
        NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        String result = fmt.format(1000);
        System.out.println(result);
        result = fmt.format(10000);
        System.out.println(result);
        result = fmt.format(2000);
        System.out.println(result);
        result = fmt.format(5500);
        System.out.println(result);
        result = fmt.format(7400);
        System.out.println(result);
        result = fmt.format(740000);
        System.out.println(result);
        result = fmt.format(740000000);
        System.out.println(result);
        result = fmt.format(60000000000L);
        System.out.println(result);
        NumberFormat cnf = NumberFormat.getCompactNumberInstance(Locale.CHINA, NumberFormat.Style.SHORT);
        System.out.println(cnf.format(1000));
        System.out.println(cnf.format(10000));
        System.out.println(cnf.format(2000));
        System.out.println(cnf.format(5500));
        System.out.println(cnf.format(7400));
        System.out.println(cnf.format(985555));
        System.out.println(cnf.format(740000));
        System.out.println(cnf.format(985555000));
        System.out.println(cnf.format(240007400));
        System.out.println(cnf.format(985550000005L));
    }
}
