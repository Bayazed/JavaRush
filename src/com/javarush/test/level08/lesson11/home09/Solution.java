package com.javarush.test.level08.lesson11.home09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года -
нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("MAY 3 2013"));
    }
    public static boolean isDateOdd(String date)
    {
        Date date1 = new Date(date);
        Date date2 = new Date(date);
        date1.setHours(0);
        date1.setMinutes(0);
        date1.setSeconds(0);
        date1.setDate(1);
        date1.setMonth(0);
        long msTimeDistance = date2.getTime() - date1.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        int y = (int)(msTimeDistance/msDay);
        return (y % 2 == 0);
    }
}
