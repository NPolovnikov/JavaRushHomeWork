package com.javarush.test.level18.lesson03.task05;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        final FileInputStream fileInputStream = new FileInputStream(new Scanner(System.in).nextLine());
        List<Integer> allList = new ArrayList<>();
        while (fileInputStream.available()>0){
            int i = fileInputStream.read();
            if (allList.indexOf(i)==-1){
                allList.add(i);
            }
        }
        sort(allList);

        for (int i: allList){
            System.out.print(i+" ");
        }
        fileInputStream.close();
    }

    public static void sort(List<Integer> array)
    {

        for(int i=0;i<array.size();i++)
        {
            for(int j=0;j<array.size()-1;j++)//Напишите тут ваш код
            {
                if (array.get(j)>array.get(j+1))
                {
                    int x = array.get(j);
                    array.set(j, array.get(j+1));
                    array.set(j+1, x);
                }
            }
        }
        return;
    }
}
