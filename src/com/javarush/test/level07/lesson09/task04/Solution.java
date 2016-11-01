package com.javarush.test.level07.lesson09.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза");
        list.add("рола");
        list.add("зоза");
        list.add("лира"); //1
        list.add("олза"); //2
        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list)
    {
        ArrayList<String> mas = new ArrayList<String>();
        int n;
        String s;

        for(int i = 0; i < list.size(); i++)    //поиск по массиву
        {
            s = list.get(i);
            n = s.length();

            for (int k = 0; k < n; k++)    //поиск в строке
            {
                if(s.substring(k, k + 1).equals("л"))
                {
                    for (int k1 = 0; k1 < n; k1++)
                    {
                        if (s.substring(k1, k1 + 1).equals("р"))
                        {
                            mas.add(s);
                            break;
                        }
                        else if (k1 == n - 1)
                        {
                            mas.add(s);
                            mas.add(s);
                            break;
                        }
                    }
                }
                else
                {
                    boolean flag = true;
                    for (int k1 = 0; k1 < n; k1++)
                        if (s.substring(k1, k1 + 1).equals("р") || s.substring(k1, k1 + 1).equals("л"))
                            flag = false;
                    if(flag == true)
                    {
                        mas.add(s);
                        break;
                    }

                }


            }
        }
        return mas;
    }
}