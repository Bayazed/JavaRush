package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        FileInputStream fileInputStream = new FileInputStream(args[0]);

        while (fileInputStream.available() > 0)
        {
            boolean flag = false;
            char data = (char) fileInputStream.read();
            for (Map.Entry<Character, Integer> entry : map.entrySet())
            {
                if (data == entry.getKey())
                {
                    flag = true;
                    int count = entry.getValue() + 1;
                    map.put(data, count);
                }
            }

            if (!flag)
            {
                map.put(data, 1);
            }
        }

        fileInputStream.close();

        ArrayList<Character> sumbol = new ArrayList<Character>();
        ArrayList<Integer> count = new ArrayList<Integer>();

        for (Map.Entry<Character, Integer> entry : map.entrySet())
        {
            sumbol.add(entry.getKey());
            count.add(entry.getValue());
            //System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for (int i = 0; i < sumbol.size() - 1; i++)
            for (int j = i + 1; j < sumbol.size(); j++)
            {
                if(sumbol.get(j).compareTo(sumbol.get(i)) < 0)
                {
                    char t = sumbol.get(i);
                    int x = count.get(i);
                    sumbol.set(i, sumbol.get(j));
                    count.set(i, count.get(j));
                    sumbol.set(j, t);
                    count.set(j, x);
                }
            }

        for (int i = 0; i < sumbol.size(); i++)
        {
            System.out.println(sumbol.get(i) + " " + count.get(i));
        }
    }
}
