package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        int age;
        boolean sex;
        String address;
        boolean married;
        ArrayList<Human> kids;

        public Human(String name, int age, boolean sex, String address, boolean married, ArrayList<Human> kids)//1
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.married = married;
            this.kids = kids;
        }

        public Human(String name)//2
        {
            this.name = name;
        }

        public Human(String name, int age)//3
        {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, boolean sex, String address)//4
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
        }

        public Human(String name, int age, boolean sex)//5
        {

            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex, String address, boolean married)//6
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.married = married;
        }

        public Human(String name, boolean sex, String address)//7
        {
            this.name = name;
            this.sex = sex;
            this.address = address;
        }

        public Human(String name, int age, String address)//8
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Human(int age, boolean sex, String address, boolean married, ArrayList<Human> kids)//9
        {
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.married = married;
            this.kids = kids;
        }

        public Human(boolean sex, String address, boolean married, ArrayList<Human> kids)//10
        {
            this.sex = sex;
            this.address = address;
            this.married = married;
            this.kids = kids;
        }
    }
}
