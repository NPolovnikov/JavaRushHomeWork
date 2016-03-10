package com.javarush.test.level18.lesson03.task03;

import java.io.FileInputStream;
import java.util.*;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
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
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < allList.size(); i++){
            int rep = 0;
            for (int j=i; j< allList.size(); j++){
                if ((allList.get(i)==allList.get(j))) {
                    rep++;
                }
            }
            if (rep > max){
                max=rep;
            }
        }

        for (int i = 0; i < allList.size(); i++){
            int rep = 0;
            for (int j=i; j< allList.size(); j++){
                if ((allList.get(i)==allList.get(j))) {
                    rep++;
                }
            }
            if (rep == max){
                result.add(allList.get(i));
            }
        }



        for (int i: result){
            System.out.print(i+" ");
        }
        fileInputStream.close();
    }
}
