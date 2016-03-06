package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //add your code here
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        int start = url.indexOf("?") + 1;
        url = url.substring(start, url.length());
        parse(url);
    }

    private static void parse(String url)
    {
        String value = null;
        while (true){
            int andSumbol = url.indexOf("&");
            if (andSumbol > 0){
                String shortUrl = url.substring(0, andSumbol);
                String value1 = parseValue(shortUrl);
                if (value1 != null){
                    value = value1;
                }
                url = url.substring(andSumbol+1, url.length());
            }else {
                String value1 = parseValue(url);
                if (value1 != null){
                    value = value1;
                }
                break;
            }
        }
        if (value != null){
            System.out.println();
            try
            {
                int i = Integer.valueOf(value);
                alert(i);
            }catch (NumberFormatException e){
               try
               {
                   double i = Double.valueOf(value);
                   alert(i);
               }catch (NumberFormatException ex){
                   alert(value);
               }
            }

        }
    }

    private static String parseValue(String shortUrl)
    {
        int sumbol = shortUrl.indexOf("=");
        if (sumbol > 0){
            String key = shortUrl.substring(0, sumbol);
            System.out.print(key+" ");
            if (key.equals("obj")){
                return shortUrl.substring(sumbol+1, shortUrl.length());
            }else{
                return null;
            }
        }else {
            System.out.print(shortUrl+" ");
            return null;
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
