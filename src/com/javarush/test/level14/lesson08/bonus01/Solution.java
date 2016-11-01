package com.javarush.test.level14.lesson08.bonus01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            //System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            System.out.println(true);
            exceptions.add(e);
        }

        try
        {
            int i  = 1 / 0;
        }
        catch (ArithmeticException e)
        {
            System.out.println(true);
            exceptions.add(e);
        }

        try
        {
            int[] a = new int[1];
            a[4] = a[0] + a[7];
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(true);
            exceptions.add(e);
        }

        try
        {
            int[] a = new int[-23];

        }
        catch (NegativeArraySizeException e)
        {
            System.out.println(true);
            exceptions.add(e);
        }

        try
        {
            int[] a = new int[1];
            a[0] = Integer.parseInt("sff");
        }
        catch (NumberFormatException e)
        {
            System.out.println(true);
            exceptions.add(e);
        }

        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            System.out.println(true);
            exceptions.add(e);
        }

        try
        {
            int i  = 1 / 0;
        }
        catch (ArithmeticException e)
        {
            System.out.println(true);
            exceptions.add(e);
        }

        try
        {
            int[] a = new int[1];
            a[4] = a[0] + a[7];
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(true);
            exceptions.add(e);
        }

        try
        {
            int[] a = new int[-23];

        }
        catch (NegativeArraySizeException e)
        {
            System.out.println(true);
            exceptions.add(e);
        }

        try
        {
            int[] a = new int[1];
            a[0] = Integer.parseInt("sff");
        }
        catch (NumberFormatException e)
        {
            System.out.println(true);
            exceptions.add(e);
        }



    }
}
