package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date)
    {
        Date now=new Date(date);
        Date start=new Date(0);
        start.setHours(0);
        start.setMinutes(0);
        start.setSeconds(0);
        start.setDate(1);
        start.setMonth(0);
        start.setYear(now.getYear());

        long end = now.getTime()-start.getTime();
        long msday = 24*60*60*1000;
        int dayCount = (int)(end/msday);
        if (dayCount % 2 == 0)
        return true;
        else return false;
    }
}
