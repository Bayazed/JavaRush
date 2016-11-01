package com.javarush.test.level08.lesson11.bonus01;

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> data = new ArrayList<String>();

        data.add("January");
        data.add("February");
        data.add("March");
        data.add("April");
        data.add("May");
        data.add("June");
        data.add("July");
        data.add("August");
        data.add("September");
        data.add("October");
        data.add("November");
        data.add("December");

        String month = reader.readLine();

        for(int i = 0; i < data.size(); i++)
        {
            if(month.equals(data.get(i)))
                System.out.println(data.get(i) + " is " + (i + 1) + " month");
        }
    }
}
