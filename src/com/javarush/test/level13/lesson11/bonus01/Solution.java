package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        Scanner fileScanner = new Scanner(new FileInputStream(fileName));
        List<Integer> list = new ArrayList<Integer>();
        while (fileScanner.hasNext()){
            int x = fileScanner.nextInt();
            if (x % 2 == 0){
                list.add(x);
            }
        }
        for (int j=0; j < list.size(); j++)
        {
            for (int i = 0; i < list.size() - 1; i++)
            {
                if (list.get(i) > list.get(i + 1))
                {
                    Collections.swap(list, i, i+1);
                }
            }
        }
        for (int x: list){
            System.out.println(x);
        }
    }
}
