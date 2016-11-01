package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileReader fileReader = new FileReader(reader.readLine());
        String world = "";
        int summa = 0;

        while (fileReader.ready())
        {
            char data = (char) fileReader.read();
            if (data >= 'a' && data <= 'z')
            {
                world += data;
            }
            else
            {
                if(world.equals("world"))
                {
                    summa++;
                }
                world = "";
            }

            if(!fileReader.ready())
            {
                if (world.equals("world"))
                {
                    summa++;
                }
            }
        }

        reader.close();
        fileReader.close();

        System.out.println(summa);
    }
}
