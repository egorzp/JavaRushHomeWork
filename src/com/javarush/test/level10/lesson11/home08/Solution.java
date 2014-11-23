package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;
import java.util.Date;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //Напишите тут ваш код
        ArrayList<String>[] arrayLists = new ArrayList[10];
        for (int i = 0; i < arrayLists.length; i++){
            arrayLists[i] = new ArrayList<String>();
            for (int j = 0; j < Math.random()*10; j++)arrayLists[i].add(new String(new Date().toString()));
        }
        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}