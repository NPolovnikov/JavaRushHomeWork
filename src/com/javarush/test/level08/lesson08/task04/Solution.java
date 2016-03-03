package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap <String, Date> ddd = createMap();
        removeAllSummerPeople(ddd);
        // код ниже не участвует в проверке - он только для того, чтоб форумчанам, которые будуть проверять в IDE было удобнее смотреть результат вивода
        System.out.println("Остались:");
        for(Map.Entry<String, Date> pair:ddd.entrySet())
        {
            String key = pair.getKey();
            System.out.println(key+";");
        }
    }
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Человек", new Date());
        map.put("Молоток", new Date("July 1 1998"));
        map.put("1",new Date());
        map.put("2",new Date());
        map.put("3",new Date());
        map.put("4",new Date());
        map.put("5",new Date());
        map.put("6",new Date());
        map.put("7",new Date());

        return map;

        //Напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator <Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<String,Date> pair=iterator.next();
            String human = pair.getKey();
            Date birthday = pair.getValue();
            if((int)birthday.getMonth()>=5&&(int)birthday.getMonth()<=7)
                iterator.remove();
        }

    }
}
