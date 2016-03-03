package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        String family;
        int age;
        int weight;
        int height;
        boolean gender;

        public Human(String name,String family, int age,int weight,int height,boolean gender){
            this.name = name;
            this.family = family;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.gender = gender;
        }
        public Human(String name,String family, int age,int weight,int height){
            this.name = name;
            this.family = family;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.gender = Boolean.parseBoolean(null);
        }
        public Human(String name,String family, int age,int weight,boolean gender){
            this.name = name;
            this.family = family;
            this.age = age;
            this.weight = weight;
            this.height = 170;
            this.gender = gender;
        }
        public Human(String name,int age,int weight, int height,boolean gender){
            this.name = name;
            this.family = "Null";
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.gender = gender;
        }
        public Human(String name, int age,int weight,boolean gender){
            this.name = name;
            this.family = "Null";
            this.age = age;
            this.weight = weight;
            this.height = 170;
            this.gender = gender;
        }
        public Human(String name, int age,int weight){
            this.name = name;
            this.family = "Null";
            this.age = age;
            this.weight = weight;
            this.height = 170;
            this.gender = Boolean.parseBoolean(null);
        }
        public Human(int age,int weight,int height,boolean gender){
            this.name = "Null";
            this.family = "Null";
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.gender = gender;
        }
        public Human(String name,String family, int age,boolean gender){
            this.name = name;
            this.family = family;
            this.age = age;
            this.weight = 70;
            this.height = 170;
            this.gender = gender;
        }
        public Human(String name,String family,boolean gender){
            this.name = name;
            this.family = family;
            this.age = 0;
            this.weight = 70;
            this.height = 170;
            this.gender = gender;
        }
        public Human(String name,String family){
            this.name = name;
            this.family = family;
            this.age = 0;
            this.weight = 70;
            this.height = 170;
            this.gender = Boolean.parseBoolean(null);
        }
        //напишите тут ваши переменные и конструкторы
    }
}
