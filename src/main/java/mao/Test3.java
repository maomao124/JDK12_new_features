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
