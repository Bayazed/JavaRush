package com.javarush.test.level03.lesson08.task03;

/* Скромность украшает человека
Ввести с клавиатуры имя и вывести надпись:
name зарабатывает $5,000. Ха-ха-ха!
Пример: BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String year = reader.readLine();

        System.out.println(year + " зарабатывает $5,000. Ха-ха-ха!");
        //напишите тут ваш код

    }
}