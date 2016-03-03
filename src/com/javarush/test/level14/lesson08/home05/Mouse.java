package com.javarush.test.level14.lesson08.home05;

/**
 * Created by npolovnikov on 03.03.16.
 */
public class Mouse implements CompItem
{
    @Override
    public String getName()
    {
        return this.getClass().getSimpleName();
    }
}
