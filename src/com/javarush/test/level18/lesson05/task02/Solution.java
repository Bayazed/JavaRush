package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));

        String file = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(file);

        int summa = 0;
        while (fileInputStream.available() > 0)
        {
            if ((char)fileInputStream.read() == ',')
            {
                summa++;
            }
        }

        reader.close();
        fileInputStream.close();

        System.out.println(summa);
    }
}
