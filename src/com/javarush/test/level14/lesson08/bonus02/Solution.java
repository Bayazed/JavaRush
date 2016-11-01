package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int nod = 1;

        if (a > b)
        {
            for (int i = 1; i <= b; i++)
            {
                if (b % i == 0 && a % i == 0)
                {
                    nod = i;
                }
            }
        }
        else
        {
            for (int i = 1; i <= a; i++)
            {
                if (b % i == 0 && a % i == 0)
                {
                    nod = i;
                }
            }
        }

        System.out.println(nod);
    }
}
