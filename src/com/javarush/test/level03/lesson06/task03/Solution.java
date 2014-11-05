package com.javarush.test.level03.lesson06.task03;

/* Семь цветов радуги
Выведи на экран текст - семь цветов радуги.
В каждой строке должно быть по три цвета, в последней - один.
Цвета в строках разделяй пробелом.
Запомни: буквы Ё в тестах нигде нет.
Чтобы тесты проходили правильно, во всех задачах заменяй Ё на Е.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        int count=1;
        ArrayList<String> rainbow  = new ArrayList<String>();
        rainbow.add("красный");
        rainbow.add("оранжевый");
        rainbow.add("желтый");
        rainbow.add("зеленый");
        rainbow.add("голубой");
        rainbow.add("синий");
        rainbow.add("фиолетовый");

        for(String color:rainbow){
            System.out.print(color);
            if((count%3) ==0)System.out.println();else if (count!=rainbow.size())System.out.print(" ");
            count++;
        }

    }
}