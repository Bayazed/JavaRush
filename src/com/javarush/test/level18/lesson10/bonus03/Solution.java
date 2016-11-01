package com.javarush.test.level18.lesson10.bonus03;

/* Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-u  - обновляет данные товара с заданным id
-d  - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        if (args.length == 5 && args[0] == "-u")
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();

            BufferedReader in = new BufferedReader(new FileReader(fileName));
            String fileContent = "";

            if (args[2].length() < 30)
            {
                while (args[2].length() < 30)
                {
                    args[2] += " ";
                }
            }
            else if (args[2].length() > 30)
            {
                args[2] = args[2].substring(0, 30);
            }


            if (args[3].length() < 8)
            {
                while (args[3].length() < 8)
                {
                    args[3] += " ";
                }
            }
            else if (args[3].length() > 8)
            {
                args[3] = args[3].substring(0, 8);
            }


            if (args[4].length() < 4)
            {
                while (args[4].length() < 4)
                {
                    args[4] += " ";
                }
            }
            else if (args[4].length() > 4)
            {
                args[4] = args[4].substring(0, 4);
            }

            while (in.ready())
            {
                String str = in.readLine();
                String index = "";

                for (int i = 0; i < 8; i++)
                {
                    try
                    {
                        if (str.charAt(i) != ' ')
                        {
                            index += str.charAt(i);
                        } else
                        {
                            break;
                        }
                    }
                    catch (Exception e)
                    {

                    }
                }

                if (index.equals(args[1]))
                {
                    if (index.length() < 8)
                    {
                        while (index.length() < 8)
                        {
                            index += " ";
                        }
                    }
                    fileContent += index + args[2] + args[3] + args[4];
                }
                else
                {
                    fileContent += str;
                }

                if (in.ready())
                {
                    fileContent += "\n";
                }
            }

            reader.close();
            in.close();

            FileWriter fileWriter = new FileWriter(fileName);

            fileWriter.write(fileContent);
            fileWriter.close();


        }
        else if (args.length == 2 && args[0] == "-d")
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();

            BufferedReader in = new BufferedReader(new FileReader(fileName));
            String fileContent = "";

            while (in.ready())
            {
                String str = in.readLine();
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

                if (!index.equals(args[1]))
                {
                    fileContent += str;
                }
                if (in.ready())
                {
                    fileContent += "\n";
                }
            }

            reader.close();
            in.close();

            FileWriter fileWriter = new FileWriter(fileName);

            fileWriter.write(fileContent);
            fileWriter.close();
        }
    }
}
