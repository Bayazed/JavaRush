package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int []m = new int [3];
        for (int i = 0; i < 3; i++)
            m[i] = Integer.parseInt(reader.readLine());

        for (int i = 0; i < 2; i++)
            for (int j = 1 + i; j < 3; j++)
            {
                if (m[i] < m[j])
                {
                    int x = m[i];
                    m[i] = m[j];
                    m[j] = x;
                }

            }
        for (int i = 0; i < 3; i++)
            System.out.println(m[i]);




    }
}
