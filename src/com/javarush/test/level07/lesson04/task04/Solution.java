package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int[] a1 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < a1.length; i++)a1[i] = Integer.parseInt(reader.readLine());
        int[] a2 = new int[10];
        for(int i = 0; i < a1.length; i++)a2[i] = a1[a1.length-1-i];
        a1 = a2;
        for (int j: a1)System.out.println(j);

    }
}
