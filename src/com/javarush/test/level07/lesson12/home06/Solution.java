package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

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

        d1.name = "bfksfv";
        d1.sex = true;
        d1.age = 245;

        d2.name = "bfsdfksfv";
        d2.sex = true;
        d2.age = 2445;

        b1.name = "svnik";
        b1.sex = false;
        b1.age = 425;

        b2.name = "sdfmvvnik";
        b2.sex = false;
        b2.age = 25;

        p.name = "bfksdffv";
        p.sex = true;
        p.age = 65;
        p.father = d1;
        p.mother = b1;

        m.name = "kssfdffv";
        m.sex = false;
        m.age = 654;
        m.father = d2;
        m.mother = b2;

        c1.name = "kssfd34ffv";
        c1.sex = false;
        c1.age = 4;
        c1.father = p;
        c1.mother = m;

        c2.name = "kssfdfdsacfv";
        c2.sex = false;
        c2.age = 3;
        c2.father = p;
        c2.mother = m;

        c3.name = "kssfd58te54ffv";
        c3.sex = false;
        c3.age = 1;
        c3.father = p;
        c3.mother = m;



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
        public Human father;
        public Human mother;

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
