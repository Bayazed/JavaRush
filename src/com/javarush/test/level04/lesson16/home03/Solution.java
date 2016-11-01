package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int s = 0;
        boolean flag = true;

        while (flag)
        {
            int t = Integer.parseInt(reader.readLine());
            s = s + t;

            if (t < 0) flag = false;
        }
        System.out.print(s);
        //напишите тут ваш код
    }
}
