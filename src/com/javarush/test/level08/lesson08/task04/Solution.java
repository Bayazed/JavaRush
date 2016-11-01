package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Ulanov", new Date("SEPTEMBER 2 1980"));
        map.put("Romanov", new Date("JUNE 3 1980"));
        map.put("Glazun", new Date("JUNE 4 1980"));
        map.put("Makarov", new Date("JUNE 5 1980"));
        map.put("Puchko", new Date("JULY 6 1980"));
        map.put("Antonov", new Date("JUNE 7 1980"));
        map.put("Bill", new Date("JUNE 8 1980"));
        map.put("Sou", new Date("JUNE 9 1980"));
        map.put("Vandin", new Date("AUGUST 10 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while(iterator.hasNext())
        {
            Date d = iterator.next().getValue();
            if(d.getMonth() > 4 && d.getMonth() < 8)
                iterator.remove();
        }
    }
}
