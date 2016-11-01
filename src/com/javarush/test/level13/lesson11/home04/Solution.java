package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String nameFile = reader.readLine();

        try
        {
            FileWriter fileWriter = new FileWriter(nameFile);

            for(; true; )
            {
                String str = reader.readLine();
                fileWriter.write(str + "\n");

                if(str.equals("exit"))
                    break;
            }

            reader.close();
            fileWriter.close();



            InputStream inputStream = new FileInputStream(nameFile);

            while(inputStream.available() > 0)
            {
                System.out.print((char) inputStream.read());
            }

            inputStream.close();
        }
        catch (Exception e)
        {

        }

        /*try
        {
            FileReader fileReader = new FileReader(nameFile);

            char[] chars = new char[(int)nameFile.length()];

            fileReader.read(chars);
            System.out.println(new String(chars));

            fileReader.close();
        }
        catch (Exception e)
        {

        }*/
    }
}
