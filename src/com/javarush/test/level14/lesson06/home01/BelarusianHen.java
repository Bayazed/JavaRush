package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Bayazed on 16.01.2016.
 */
public class BelarusianHen extends Hen implements Country
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 9;
    }

    String getDescription()
    {
        return super.getDescription() + " Моя страна - " + BELARUS + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
