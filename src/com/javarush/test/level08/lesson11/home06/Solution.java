package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код

        ArrayList<Human> family = new ArrayList<Human>();
        Human child1 = new Human("child1", true, 10, new ArrayList<Human>());
        Human child2 = new Human("child2", false, 10,new ArrayList<Human>());
        Human child3 = new Human("child3", true, 10, new ArrayList<Human>());
        ArrayList<Human> children = new ArrayList<Human>();
        children.add(child1);
        children.add(child2);
        children.add(child3);
        family.addAll(children);
        Human father = new Human("father", true, 30, children);
        Human mother = new Human("mother", false, 30, children);
        ArrayList<Human> pr1 = new ArrayList<Human>();
        pr1.add(father);
        ArrayList<Human> pr2 = new ArrayList<Human>();
        pr2.add(mother);
        Human grFather1 = new Human("grFather1", true, 60,pr1);
        Human grMother1 = new Human("grMother1", false, 60,pr1);
        family.addAll(pr1);
        family.addAll(pr2);
        Human grFather2 = new Human("grFather2", true, 60,pr2);
        Human grMother2 = new Human("grMother2", false, 60,pr2);
        family.add(grFather1);
        family.add(grFather2);
        family.add(grMother1);
        family.add(grMother2);
        for(Human human: family)System.out.println(human);
    }

    public static class Human
    {
        //Написать тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
