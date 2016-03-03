package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {


        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {

        int minimum = array.get(0);
        for(int i=1;i<array.size();i++)
            if (array.get(i)<minimum)
                minimum=array.get(i);
        //find minimum here - найти минимум тут
        return minimum;
    }

    public static List<Integer> getIntegerList() throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());


        List<Integer> list = new ArrayList<Integer>();
        for (int i=0;i<n;i++)
        {
            list.add(Integer.parseInt(reader.readLine()));

        }
        //create and initialize a list here - создать и заполнить список тут
        return list;
    }
}
