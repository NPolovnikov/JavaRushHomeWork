package com.javarush.test.level18.lesson03.task02;

import java.io.FileInputStream;
import java.util.Scanner;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        final FileInputStream fileInputStream = new FileInputStream(new Scanner(System.in).nextLine());
        int min = Integer.MAX_VALUE;
        while (fileInputStream.available()>0){
            int i = fileInputStream.read();
            if (i < min){
                min = i;
            }
        }
        System.out.println(min);
        fileInputStream.close();
    }
}
