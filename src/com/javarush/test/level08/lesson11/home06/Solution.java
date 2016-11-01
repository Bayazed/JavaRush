package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human d1 = new Human();
        Human d2 = new Human();
        Human b1 = new Human();
        Human b2 = new Human();
        Human p = new Human();
        Human m = new Human();
        Human c1 = new Human();
        Human c2 = new Human();
        Human c3 = new Human();

        d1.name = "Bob";
        d1.sex = true;
        d1.age = 89;
        d1.children.add(p);

        b1.name = "Mia";
        b1.sex = false;
        b1.age = 87;
        b1.children.add(p);

        d2.name = "Bobi";
        d2.sex = true;
        d2.age = 77;
        d2.children.add(m);

        b2.name = "Miam";
        b2.sex = false;
        b2.age = 69;
        b2.children.add(m);

        p.name = "Dima";
        p.sex = true;
        p.age = 45;
        p.children.add(c1);
        p.children.add(c2);
        p.children.add(c3);

        m.name = "Masha";
        m.sex = false;
        m.age = 45;
        m.children.add(c1);
        m.children.add(c2);
        m.children.add(c3);

        c1.name = "Dasha";
        c1.sex = false;
        c1.age = 17;

        c3.name = "Nastya";
        c3.sex = false;
        c3.age = 12;

        c2.name = "Vika";
        c2.sex = false;
        c2.age = 15;

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(p);
        System.out.println(m);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }

    public static class Human
    {
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children = new ArrayList<Human>();

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
