package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file = reader.readLine();
        int max = -1;
        FileInputStream fileInputStream = new FileInputStream(file);

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();

            if(data > max)
            {
                max = data;
            }
        }

        reader.close();
        fileInputStream.close();

        System.out.println(max);
    }
}
