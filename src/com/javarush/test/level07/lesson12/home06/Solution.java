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

public class Solution
{
    public static void main(String[] args)
    {
        Human Gfa1 = new Human("Олег", true, 55 );
        Human Gmo1 = new Human("Света",false, 53);
        Human Gfa2 = new Human("Иван",true,52);
        Human Gmo2 = new Human("Ирина",false,50);
        Human fa = new Human("Макс",true,33,Gfa1,Gmo1);
        Human mo = new Human("Юля",false,30,Gfa2,Gmo2);
        Human ch1 = new Human("Катя",false,10,fa,mo);
        Human ch2 = new Human("Миша",true,7,fa,mo);
        Human ch3 = new Human("Лена",false,5,fa,mo);
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
        Boolean  sex;
        Integer age;
        Human father;
        Human mother;//Написать тут ваш код

        public Human(String name, Boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, Boolean sex, int age,Human father ) {
        this.name=name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        }

        public Human(String name, Boolean sex, int age,Human father,Human mother ) {
            this.name=name;
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
