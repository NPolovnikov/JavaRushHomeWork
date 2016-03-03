package com.javarush.test.level14.lesson06.home01;

/**
 * Created by npolovnikov on 03.03.16.
 */
public abstract class Hen{
    public String getDescription(){
        return "Я курица.";
    }

    public abstract int getCountOfEggsPerMonth();

}