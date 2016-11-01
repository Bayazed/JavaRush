package com.javarush.test.level15.lesson12.home01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения, кроме "exit", вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for ( ; true; )
        {
            String str = reader.readLine();
            if(str.equals("exit"))
            {
                break;
            }

            int n = str.length();

            boolean flag = false;
            for(int i = 0; i < n; i++)
            {
                if(str.substring(i, i + 1).equals("."))
                {
                    try
                    {
                        flag = true;
                        double d = Double.parseDouble(str);
                        print(d);
                        break;
                    }
                    catch (Exception e)
                    {
                        print(str);
                        break;
                    }
                }
            }
            if(flag == false)
            {
                try
                {
                    int d = Integer.parseInt(str);
                    if(d > 0 && d < 128)
                    {
                        print((short)d);
                    }
                    else if(d >= 128)
                    {
                        print(d);
                    }
                    else
                    {
                        print(str);
                    }
                }
                catch (Exception e)
                {
                    print(str);
                }
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
