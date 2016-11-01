package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Bayazed on 16.01.2016.
 */
public class RussianHen extends Hen implements Country
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 11;
    }

    String getDescription()
    {
        return super.getDescription() + " Моя страна - " + RUSSIA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}
