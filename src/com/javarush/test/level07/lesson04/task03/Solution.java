package com.javarush.test.level07.lesson04.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static final int SIZE = 10;

    public static void main(String[] args) throws Exception
    {
        String[] a1 = new String[SIZE];
        int[] a2 = new int[SIZE];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < a1.length; i++)a1[i]=reader.readLine();
        for (int j = 0; j < a1.length; j++)a2[j] = a1[j].length();
        for (int x:a2)System.out.println(x);



    }
}
