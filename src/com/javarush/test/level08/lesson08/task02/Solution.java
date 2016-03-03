package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(removeAllNumbersMoreThan10(createSet()));
    }

    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 20; i++)
            set.add(i);
        return set;//Напишите тут ваш код

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        HashSet<Integer> nset = new HashSet<Integer>();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int a = iterator.next();
            if (a <= 10)
                nset.add(a);

        }
        return nset;
    }
}
