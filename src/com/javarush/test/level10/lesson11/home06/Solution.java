package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        public int a;
        public boolean b;
        public String c;
        public char d;
        public double e;
        public byte f;

        public Human(int a)
        {
            this.a = a;
        }

        public Human(boolean b)
        {
            this.b = b;
        }

        public Human(String c)
        {
            this.c = c;
        }

        public Human(char d)
        {
            this.d = d;
        }

        public Human(double e)
        {
            this.e = e;
        }

        public Human(byte f)
        {
            this.f = f;
        }

        public Human(int a, String c)
        {
            this.a = a;
            this.c = c;
        }

        public Human(int a, String c, boolean b)
        {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public Human(int a, String c, boolean b, char d)
        {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }

        public Human(int a, String c, boolean b, char d, double e)
        {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
    }
}
