package com.javarush.test.level22.lesson09.task02;

import java.util.Map;

/* Формируем Where
Сформируйте часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.
Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
*/
public class Solution {

    public static StringBuilder getCondition(Map<String, String> params)
    {
        String string = "";
        int i = 0;
        for (Map.Entry<String, String> entry : params.entrySet())
        {
            if (entry.getKey() != null && entry.getValue() != null)
            {
                if (i > 0)
                {
                    string += " and " + entry.getKey() + " = '" + entry.getValue() + "'";
                }
                else
                {
                    string += entry.getKey() + " = '" + entry.getValue() + "'";
                }
                i++;
            }
        }
        return new StringBuilder(string);
    }
}
