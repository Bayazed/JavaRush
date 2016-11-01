package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Bayazed on 22.01.2016.
 */
public class Singleton
{
    static Singleton singleton = null;

    static Singleton getInstance()
    {
        if (singleton == null)
        {
            singleton = new Singleton();
        }
        return singleton;
    }

    private Singleton()
    {

    }
}
