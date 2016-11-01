package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        Map<String, String> map = new HashMap<String, String>();

        map.put("Ulanov1", "Vlad1");
        map.put("Ulanov2", "Vlad2");
        map.put("Ulanov3", "Vlad3");
        map.put("Ulanov4", "Vlad4");
        map.put("Ulanov5", "Vlad5");
        map.put("Ulanov6", "Vlad6");
        map.put("Ulanov7", "Vlad7");
        map.put("Ulanov8", "Vlad8");
        map.put("Ulanov9", "Vlad9");
        map.put("Ulanov10", "Vlad10");

        return map;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
