package com.javarush.test.level08.lesson03.task01;

/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.HashSet;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        HashSet<String> stringHashSet = new HashSet<String>();
        //String[] strings = new String[]{"арбуз ", "банан", "вишня", "груша", "дыня", "ежевика", "жень-шень", "земляника", "ирис", "картофель"};
        //for(int i = 0; i < strings.length; i++)stringHashSet.add(strings[i]);
        stringHashSet.add("арбуз");
        stringHashSet.add("банан");
        stringHashSet.add("вишня");
        stringHashSet.add("груша");
        stringHashSet.add("дыня");
        stringHashSet.add("ежевика");
        stringHashSet.add("жень-шень");
        stringHashSet.add("земляника");
        stringHashSet.add("ирис");
        stringHashSet.add("картофель");

        for(String s: stringHashSet)System.out.println(s);

    }
}
