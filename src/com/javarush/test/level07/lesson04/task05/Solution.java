package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static final int SIZE = 20;

    public static void main(String[] args) throws Exception
    {
        int[] a1 = new int[SIZE];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < a1.length; i++)a1[i]=Integer.parseInt(reader.readLine());
        int[]b1 = new int[SIZE/2];
        int[]b2 = new int[SIZE/2];
        for (int i = 0; i < a1.length; i++){
            if(i >= a1.length/2)b2[i - a1.length/2] = a1[i];
            else b1[i] = a1[i];
        }
        for (int i: b2)System.out.println(i);


    }
}
