package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        String nameFile = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(nameFile);

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            boolean flag = false;

            for (int i = 0; i < list.size(); i++)
            {
                if (data == list.get(i))
                {
                    flag = true;
                }
            }

            if (!flag)
            {
                list.add(data);
            }
        }

        reader.close();
        fileInputStream.close();

        for (int i = 0; i < list.size() - 1; i++)
        {
            for (int j = 1 + i; j < list.size(); j++)
            {
                if (list.get(i) > list.get(j))
                {
                    int x = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, x);
                }
            }
        }

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
