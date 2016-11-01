package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        int count_slash = 0;
        int count_all = 0;

        if(args.length > 0)
        {
            FileInputStream fileInputStream = new FileInputStream(args[0]);

            while (fileInputStream.available() > 0)
            {
                int data = fileInputStream.read();
                count_all++;

                if (data == Integer.valueOf(' '))
                {
                    count_slash++;
                }
            }

            fileInputStream.close();
        }

        if(count_all != 0)
        {
            System.out.println((double) count_slash / count_all * 100);
        }
    }
}
