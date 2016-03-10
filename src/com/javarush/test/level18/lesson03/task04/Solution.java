package com.javarush.test.level18.lesson03.task04;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        final FileInputStream fileInputStream = new FileInputStream(new Scanner(System.in).nextLine());
        List<Integer> allList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        while (fileInputStream.available()>0){
            allList.add(fileInputStream.read());
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < allList.size(); i++){
            int rep = 1;
            for (int j=i+1; j< allList.size(); j++){
                if ((allList.get(i)==allList.get(j))) {
                    rep++;
                }
            }
            if (rep < min){
                min=rep;
            }
        }

        for (int i = 0; i < allList.size(); i++){
            int rep = 1;
            for (int j=i+1; j< allList.size(); j++){
                if ((allList.get(i)==allList.get(j))) {
                    rep++;
                    allList.remove(j);
                }
            }
            if (rep == min){
                result.add(allList.get(i));
            }
        }

        for (int i: result){
            System.out.print(i+" ");
        }
        fileInputStream.close();
    }
}
