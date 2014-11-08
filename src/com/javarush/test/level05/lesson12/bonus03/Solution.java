package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;
        while(true){
            maximum = Integer.parseInt(reader.readLine());
            if (maximum > 0)break;
        }

        int[] array = new int[maximum];
        for(int i = 0; i < array.length; i++){
            array[i]=Integer.parseInt(reader.readLine());
        }
        Arrays.sort(array);
        maximum = array[array.length-1];
        System.out.println(maximum);
    }
}
