package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла,
генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception
    {
        if (args.length == 4 && args[0] == "-c")
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();

            BufferedReader in = new BufferedReader(new FileReader(fileName));
            ArrayList<Integer> ids = new ArrayList<Integer>();

            String fileContent = "";
            int id = 0;

            while (in.ready())
            {
                String str = in.readLine();
                fileContent += str + '\n';

                String index = "";
                for (int i = 0; i < 8; i++)
                {
                    try
                    {
                        if (str.charAt(i) != ' ')
                        {
                            index += str.charAt(i);
                        }
                        else
                        {
                            break;
                        }
                    }
                    catch (Exception e)
                    {

                    }
                }
                try
                {
                    ids.add(Integer.parseInt(index));
                }
                catch (NumberFormatException e)
                {

                }
            }
            reader.close();
            in.close();

            for (int i = 0; i < ids.size(); i++)
            {
                if (ids.get(i) >= id)
                {
                    id = ids.get(i) + 1;
                }
            }

            String idStr = id + "";

            if (idStr.length() < 8)
            {
                while (idStr.length() < 30)
                {
                    idStr += " ";
                }
            }

            if (args[1].length() < 30)
            {
                while (args[1].length() < 30)
                {
                    args[1] += " ";
                }
            }
            else if (args[1].length() > 30)
            {
                args[1] = args[1].substring(0, 30);
            }


            if (args[2].length() < 8)
            {
                while (args[2].length() < 8)
                {
                    args[2] += " ";
                }
            }
            else if (args[2].length() > 8)
            {
                args[2] = args[2].substring(0, 8);
            }


            if (args[3].length() < 4)
            {
                while (args[3].length() < 4)
                {
                    args[3] += " ";
                }
            }
            else if (args[3].length() > 4)
            {
                args[3] = args[3].substring(0, 4);
            }

            fileContent += idStr + args[1] + args[2] + args[3];

            FileWriter fileWriter = new FileWriter(fileName);

            fileWriter.write(fileContent);
            fileWriter.close();
        }
    }
}
