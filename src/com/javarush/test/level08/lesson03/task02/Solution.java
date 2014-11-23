package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз – ягода, банан – трава, вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель – клубень
*/

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String, String> stringHashSet = new HashMap<String, String>();
        stringHashSet.put("арбуз","ягода");
        stringHashSet.put("банан","трава");
        stringHashSet.put("вишня","ягода");
        stringHashSet.put("груша","фрукт");
        stringHashSet.put("дыня","овощ");
        stringHashSet.put("ежевика","куст");
        stringHashSet.put("жень-шень","корень");
        stringHashSet.put("земляника","ягода");
        stringHashSet.put("ирис", "цветок");
        stringHashSet.put("картофель", "клубень");
        for (Map.Entry<String, String> entry: stringHashSet.entrySet())System.out.println(entry.getKey() + " - " + entry.getValue());


    }
}
