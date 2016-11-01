package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Уланов", "Влад");
        map.put("Гоголь", "Павел");
        map.put("Мазаков", "Антон");
        map.put("Михайлов", "Олег");
        map.put("Пушкин", "Алексей");
        map.put("Сидоров", "Олегфы");
        map.put("Анотонов", "Павел");
        map.put("Мамонтов", "Денис");
        map.put("Сергеев", "Пав");
        map.put("Шамшинов", "Увел");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int i = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String,String> pair = iterator.next();
            String value = pair.getValue();
            if(value.equals(name)) {
                i++;
            }
        }
        return i;
    }
    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int i = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String,String> pair = iterator.next();
            String key = pair.getKey();
            if(key.equals(familiya)) {
                i++;
            }
        }
        return i;
    }
}
