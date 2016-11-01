package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        String nameFile = bufferedReader.readLine();

        FileInputStream fileInputStream = new FileInputStream(nameFile);

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            boolean flag = false;

            for (Map.Entry<Integer, Integer> entry : map.entrySet())
            {
                if (data == entry.getKey())
                {
                    flag = true;
                    entry.setValue(entry.getValue() + 1);
                }
            }

            if (!flag)
            {
                map.put(data, 1);
            }
        }
        bufferedReader.close();
        fileInputStream.close();

        int max = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if (entry.getValue() > max)
            {
                max = entry.getValue();
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if (max == entry.getValue())
            {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
