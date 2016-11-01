package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();

        ArrayList<Character> gl = new ArrayList<Character>();
        ArrayList<Character> sl = new ArrayList<Character>();

        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i++)
        {
            String p = "" + c[i];
            if(isVowel(c[i]) && !(p.equals(" ")))
                gl.add(c[i]);
            else if (!(p.equals(" ")))
                sl.add(c[i]);
        }

        for(int i = 0; i < gl.size(); i++)
            System.out.print(gl.get(i) + " ");

        System.out.println();

        for(int i = 0; i < sl.size(); i++)
            System.out.print(sl.get(i) + " ");
    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
