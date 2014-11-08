package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        // Создай по два объекта каждого класса тут
        Woman w1 = new Woman("W1", "123", 32);
        Woman w2 = new Woman("W2", "123", 22);
        Man m1 = new Man("M1", "123", 23);
        Man m2 = new Man( "M2", "123", 28);
        System.out.println(w1);
        System.out.println(w2);
        System.out.println(m1);
        System.out.println(m2);

        // Выведи их на экран тут
    }

    public static class Man{
        String name;
        String address;
        int age;

        public Man(String name, String address, int age)
        {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        @Override
        public String toString()
        {
            return  name + " " + age + " " + address;
        }
    }
    public static class Woman{
        String name;
        String address;
        int age;

        public Woman(String name, String address, int age)
        {
            this.age = age;
            this.address = address;
            this.name = name;
        }
        @Override
        public String toString()
        {
            return  name + " " + age + " " + address;
        }
    }
}
