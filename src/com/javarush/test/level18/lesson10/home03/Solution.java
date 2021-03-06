package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileInputStream fileInputStream2 = new FileInputStream(fileName2);
        FileInputStream fileInputStream3 = new FileInputStream(fileName3);

        FileOutputStream fileOutputStream1 = new FileOutputStream(fileName1);

        while (fileInputStream2.available() > 0)
        {
            int data = fileInputStream2.read();
            fileOutputStream1.write(data);
        }

        while (fileInputStream3.available() > 0)
        {
            int data = fileInputStream3.read();
            fileOutputStream1.write(data);
        }

        reader.close();
        fileInputStream2.close();
        fileInputStream3.close();
        fileOutputStream1.close();
    }
}
