package com.javarush.test.level08.lesson11.home01;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Solution{
    public static void main(String[] args){
        Set<Cat> cats = createCats();

        Iterator<Cat> i = cats.iterator();
        i.next();
        i.remove();
        printCats(cats);
    }
    public static Set<Cat> createCats()
    {
        Set<Cat> c = new HashSet<Cat>();
        for (int i = 0; i < 3; i++)
        {
            c.add(new Cat());
        }
        return c;
    }
    public static void printCats(Set<Cat> cats)
    {
        for (Object c : cats)
        {
            System.out.println(c);
        }
    }
    public static class Cat {

    }
}
