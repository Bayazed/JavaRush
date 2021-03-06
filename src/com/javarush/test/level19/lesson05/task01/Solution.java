package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileReader fileReader = new FileReader(reader.readLine());
        FileWriter fileWriter = new FileWriter(reader.readLine());

        int index = 0;

        while (fileReader.ready())
        {
            index++;
            int data = fileReader.read();

            if (index % 2 == 0)
            {
                fileWriter.write(data);
            }
        }

        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}
