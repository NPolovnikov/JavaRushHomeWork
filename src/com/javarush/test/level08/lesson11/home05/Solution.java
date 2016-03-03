package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        String text11 = "";

        text11 += Character.toString(text.charAt(0)).toUpperCase();

        for (int i = 1; i < text.length(); i++)
        {

            if (Character.toString(text.charAt(i-1)).equals(" "))
            {
                text11 += Character.toString(text.charAt(i)).toUpperCase();
            }
            else
                text11 += Character.toString(text.charAt(i));

        }

        System.out.print(text11);//Напишите тут ваш код
    }


}
