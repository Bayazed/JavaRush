package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> mas = new ArrayList<int[]>();
        mas.add(new int []{23, 34, 4, 1, 5});
        mas.add(new int []{2, 7});
        mas.add(new int []{489, 34, 2, 4});
        mas.add(new int []{1, 2, 3, 4, 5, 6, 7});
        mas.add(new int []{});

        return mas;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
