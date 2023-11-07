



## String增强

### 概述

Java 11 增加了两个的字符串处理方法

* `indent()` 方法可以实现字符串缩进
* `transform()` 方法可以用来转变指定字符串





### 使用

```java
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
```



```sh
Java
    Java

            Java

              Java

               Java

               Java

     Java
```





```java
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
```



```sh
ABC
foo bar
```







## Files增强

### 概述

Java 12 添加了以下方法来比较两个文件：

* `mismatch()` 方法用于比较两个文件，并返回第一个不匹配字符的位置，如果文件相同则返回 -1L



### 使用

```java
package mao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Project name(项目名称)：JDK12_new_features
 * Package(包名): mao
 * Class(类名): Test3
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/6
 * Time(创建时间)： 17:33
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test3
{
    public static void main(String[] args) throws IOException
    {
        {
            Path filePath1 = Files.createTempFile("file1", ".txt");
            Path filePath2 = Files.createTempFile("file2", ".txt");
            Files.writeString(filePath1, "1234567890");
            Files.writeString(filePath2, "1234567890");

            long mismatch = Files.mismatch(filePath1, filePath2);
            System.out.println(mismatch);
        }

        {
            Path filePath3 = Files.createTempFile("file3", ".txt");
            Path filePath4 = Files.createTempFile("file4", ".txt");
            Files.writeString(filePath3, "1234567890");
            Files.writeString(filePath4, "1234557890");

            long mismatch = Files.mismatch(filePath3, filePath4);
            System.out.println(mismatch);
        }
        {
            Path filePath3 = Files.createTempFile("file3", ".txt");
            Path filePath4 = Files.createTempFile("file4", ".txt");
            Files.writeString(filePath3, "1234567890");
            Files.writeString(filePath4, "1224557890");

            long mismatch = Files.mismatch(filePath3, filePath4);
            System.out.println(mismatch);
        }
    }
}
```



```sh
-1
5
2
```







## 数字格式化工具类

### 概述

`NumberFormat` 新增了对复杂的数字进行格式化的支持



### 使用

```java
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

```



```sh
1K
10K
2K
6K
7K
740K
740M
60B
1,000
1万
2,000
5,500
7,400
99万
74万
10亿
2亿
9856亿
```









## instanceof 模式匹配

### 概述

`instanceof` 主要在类型强转前探测对象的具体类型



### 使用

之前的版本中，我们需要显示地对对象进行类型转换

```java
 Object o = "hello";
        if (o instanceof String)
        {
            String str = (String) o;
            System.out.println(str);
        }
```



新版的 `instanceof` 可以在判断是否属于具体的类型同时完成转换

```java
if (o instanceof String str)
        {
            System.out.println(str);
        }
```





```java
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
```



```sh
hello
hello
```













## 其它

### 移除项

* 移除com.sun.awt.SecurityWarnin
* 移除FileInputStream、FileOutputStream、- Java.util.ZipFile/Inflator/Deflator的finalize方法
* 移除GTE CyberTrust Global Root
* 移除javac的-source, -target对6及1.6的支持，同时移除--release选项





### 废弃项

* 废弃的API列表见deprecated-list
* 废弃-XX:+/-MonitorInUseLists选项
* 废弃Default Keytool的-keyalg值



