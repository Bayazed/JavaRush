package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Bayazed on 16.01.2016.
 */
public class MoldovanHen extends Hen implements Country
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 3;
    }

    String getDescription()
    {
        return super.getDescription() + " Моя страна - " + MOLDOVA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
