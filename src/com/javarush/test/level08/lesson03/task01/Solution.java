package com.javarush.test.level08.lesson03.task01;

/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Set<String> a = new HashSet<String>();
        a.add("арбуз");
        a.add("банан");
        a.add("вишня");
        a.add("груша");
        a.add("дыня");
        a.add("ежевика");
        a.add("жень-шень");
        a.add("земляника");
        a.add("ирис");
        a.add("картофель");

        Iterator<String> iterator = a.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
