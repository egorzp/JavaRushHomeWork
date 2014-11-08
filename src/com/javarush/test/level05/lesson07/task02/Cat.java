package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private static final int DEFAULT_WEIGHT = 5;
    String name;
    int weight;
    int age;
    String color;
    String address;

    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name, int weight, int age){
        initialize(name);
        this.weight = weight;
        this.age = age;
    }
    public void initialize(String name, int age){
        initialize(name, DEFAULT_WEIGHT, age);
    }
    public void initialize(int weight, String color){
        initialize(null, weight);
        this.color = color;
    }
    public void initialize(int weight, String color, String address){
        initialize(weight, color);
        this.address = address;

    }

}
