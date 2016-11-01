package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String nameFile1 = reader.readLine();
        String nameFile2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(nameFile1);
        FileOutputStream outputStream = new FileOutputStream(nameFile2);

        int[] buffer = new int[1000];
        int count = 0;

        while (inputStream.available() > 0)
        {
            buffer[count] = inputStream.read();
            count++;
        }

        for (int i = count - 1; i >=0; i--)
        {
            outputStream.write(buffer[i]);
        }

        reader.close();
        inputStream.close();
        outputStream.close();
    }
}
