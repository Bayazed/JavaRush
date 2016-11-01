package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by Bayazed on 16.01.2016.
 */
abstract class DrinkMaker {
    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();

    void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }
}
