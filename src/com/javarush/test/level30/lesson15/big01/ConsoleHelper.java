package com.javarush.test.level30.lesson15.big01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by
 * Polurival on 21.03.2016.
 */
public class ConsoleHelper
{
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message)
    {
        System.out.println(message);
    }

    public static String readString()
    {
        String str;
        while (true)
        {
            try
            {
                str = reader.readLine();
                break;
            }
            catch (IOException e)
            {
                writeMessage("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
            }
        }
        return str;
    }

    public static int readInt()
    {
        int number;
        while (true)
        {
            try
            {
                number = Integer.valueOf(readString());
                break;
            }
            catch (NumberFormatException e)
            {
                writeMessage("Произошла ошибка при попытке ввода числа. Попробуйте еще раз.");
            }
        }
        return number;
    }
}
