package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileInputStream fileInputStream1 = new FileInputStream(fileName1);
        FileInputStream fileInputStream2 = new FileInputStream(fileName2);

        ArrayList<Integer> list = new ArrayList<Integer>();

        while (fileInputStream2.available() > 0)
        {
            list.add(fileInputStream2.read());
        }

        while (fileInputStream1.available() > 0)
        {
            list.add(fileInputStream1.read());
        }

        reader.close();
        fileInputStream1.close();
        fileInputStream2.close();

        FileOutputStream fileOutputStream = new FileOutputStream(fileName1);

        for (int i = 0; i < list.size(); i++)
        {
            fileOutputStream.write(list.get(i));
        }

        fileOutputStream.close();
    }
}
