package com.javarush.test.level06.lesson11.bonus03;

import com.javarush.test.level06.lesson08.task02.Cat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    static final int COUNT = 5;
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int[] mass = new int[COUNT];
        for (int i = 0; i < mass.length; i++){
            mass[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(mass);
        for (int j: mass){System.out.println(j);}
    }
}
