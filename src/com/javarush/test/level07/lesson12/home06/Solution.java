package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.awt.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> list = new ArrayList<Human>();

        Human grandFather1 = new Human("gr1", true, 70, null, null);
        Human grandFather2 = new Human("gr2", true, 70, null, null);
        Human grandMother1 = new Human("grM1", false, 70, null, null);
        Human grandMother2 = new Human("grM2", false, 70, null, null);
        Human father = new Human("father", true, 40, grandFather1, grandMother1);
        Human mother = new Human("mother", false, 38, grandFather2, grandMother2);
        Human child1 = new Human("child1", true, 12, father, mother);
        Human child2 = new Human("child2", true, 12, father, mother);
        Human child3 = new Human("child3", true, 12, father, mother);
        list.add(grandFather1);
        list.add(grandFather2);
        list.add(grandMother1);
        list.add(grandMother2);
        list.add(father);
        list.add(mother);
        list.add(child1);
        list.add(child2);
        list.add(child3);
        for (Human h: list)System.out.println(h);
    }

    public static class Human
    {
        String name;
        Boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, Boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
