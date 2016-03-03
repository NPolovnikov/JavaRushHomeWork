package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args)
    {


        String name="hh";
        String familiya="h";
        System.out.println(getCountTheSameFirstName(createMap(), name));
        System.out.println(getCountTheSameLastName(createMap(), familiya));

    }

    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> map = new HashMap<String, String>();
        map.put("a","aa");
        map.put("b","bb");
        map.put("c","cc");
        map.put("d","hh");
        map.put("e","hh");
        map.put("f","hh");
        map.put("g","gg");
        map.put("h","dd");
        map.put("j","ee");
        map.put("k","ff");

        //Напишите тут ваш код

    return map;
    }


    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {

            int count = 0;
            for(String i : map.values())
            {
                if (i.equals(name))
                    count++;
            }
            return count;

        //Напишите тут ваш код

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count = 0;
        for(String i : map.keySet())
        {
            if (familiya.equals(i))
                count++;
        }
        return count;

        //Напишите тут ваш код

    }
}
