package com.javarush.test.level08.lesson08.task05;

import com.javarush.test.level06.lesson08.task05.StringHelper;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap <String, String> testMap = createMap();
        System.out.println(testMap);
        removeTheFirstNameDuplicates(testMap);
        System.out.println(testMap);

    }
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("surname1", "name3");
        map.put("surname2", "name9");
        map.put("surname3", "name8");
        map.put("surname4", "name3");
        map.put("surname5", "name5");
        map.put("surname6", "name4");
        map.put("surname7", "name3");
        map.put("surname8", "name1");
        map.put("surname9", "name2");
        map.put("surname10", "name1");

        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> newMap = new HashMap<String, String>();
        HashMap<String, String> temp = new HashMap<String, String>();
        for (Map.Entry<String, String> entry: map.entrySet()){
            if(!newMap.containsValue(entry.getValue())&&!temp.containsValue(entry.getValue())){
                newMap.put(entry.getKey(), entry.getValue());
                temp.put(entry.getKey(), entry.getValue());
            }else removeItemFromMapByValue(newMap, entry.getValue());
        }
        map.clear();
        map.putAll(newMap);
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
