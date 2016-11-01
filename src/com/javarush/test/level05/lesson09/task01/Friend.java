package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    public String name;
    public int rost;
    public String color;

    public Friend(String name)
    {
        this.name = name;
    }
    public Friend(String name, int rost)
    {
        this.name = name;
        this.rost = rost;
    }
    public Friend(String name, int rost, String color)
    {
        this.name = name;
        this.rost = rost;
        this.color = color;
    }
    //напишите тут ваш код

}