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
        Human ch1 = new Human("Катя",false,10,new ArrayList<Human>());
        Human ch2 = new Human("Миша",true,7,new ArrayList<Human>());
        Human ch3 = new Human("Лена",false,5,new ArrayList<Human>());

        ArrayList<Human> Fa=new ArrayList<Human>();
        Fa.add(ch1);
        Fa.add(ch2);
        Fa.add(ch3);

        Human fa = new Human("Макс",true,33,Fa);
        Human mo = new Human("Юля",false,30,Fa);

        ArrayList<Human> Gfa=new ArrayList<Human>();
        Gfa.add(fa);
        ArrayList<Human> Gmo=new ArrayList<Human>();
        Gmo.add(mo);

        Human Gfa1 = new Human("Олег", true, 55,Gfa);
        Human Gmo1 = new Human("Света",false, 53,Gfa);
        Human Gfa2 = new Human("Иван",true,52,Gmo);
        Human Gmo2 = new Human("Ирина",false,50,Gmo);

        System.out.println(Gfa1);
        System.out.println(Gmo1);
        System.out.println(Gfa2);
        System.out.println(Gmo2);
        System.out.println(fa);
        System.out.println(mo);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        //Написать тут ваш код
    }

    public static class Human
    {
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children;//Написать тут ваш код

        public Human(String name, Boolean sex,int age)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name, Boolean sex,int age,ArrayList<Human> children)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
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
