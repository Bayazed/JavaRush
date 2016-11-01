package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        Map<String, Double> list = new HashMap<String, Double>();
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        while (reader.ready())
        {
            String[]line = reader.readLine().split(" ");

            if (list.size() > 0)
            {
                boolean flag = true;
                for (Map.Entry<String, Double> entry : list.entrySet())
                {
                    if (entry.getKey().equals(line[0]))
                    {
                        list.put(line[0], entry.getValue() + Double.parseDouble(line[1]));
                        flag = false;
                    }
                }
                if (flag)
                {
                    list.put(line[0], Double.parseDouble(line[1]));
                }
            }
            else
            {
                list.put(line[0], Double.parseDouble(line[1]));
            }
        }

        reader.close();

        double max = 0;

        for (double value : list.values())
        {
            if (max < value)
            {
                max = value;
            }
        }

        for (Map.Entry<String, Double> entry : list.entrySet())
        {
            if (max == entry.getValue())
            {
                System.out.println(entry.getKey());
            }
        }
    }
}
