package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
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
        return map;//Напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {

        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        ArrayList<String>valuesList = new ArrayList<String>();
        HashMap<String, String> copy = new HashMap<String, String>(map);

        while (iterator.hasNext())
        {
            valuesList.add(iterator.next().getValue());
        }

        int j = 0;

        for (Map.Entry<String, String> s : copy.entrySet())
        {
            int i = 0;
            for (int k = 0; k<valuesList.size(); k++)
            {
                for ( ; i < valuesList.size();i++)
                {
                    if (valuesList.get(i).equals(s.getValue()))
                    {
                        j = j + 1;
                    }
                    if (j >= 2)
                    {
                        removeItemFromMapByValue(map, valuesList.get(i));
                        j = 0;
                    }
                }
                j=0;
            }
        }
        //Напишите тут ваш код

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
