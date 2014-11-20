package com.javarush.test.level09.lesson11.home05;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String s1= "";
        String s2 = "";
        char[] array = str.toCharArray();
        for(int i = 0 ; i < array.length; i++){
            if(array[i]== ' ')continue;
            if(isVowel(array[i]))s1 = s1 + array[i] + " ";
            else s2 = s2 + array[i] + " ";
        }
        array = s1.toCharArray();
        for(int i = 0; i < array.length-1;i++)System.out.print(array[i]);
        System.out.print("\n");
        array = s2.toCharArray();
        for(int i = 0; i < array.length-1;i++)System.out.print(array[i]);

    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
