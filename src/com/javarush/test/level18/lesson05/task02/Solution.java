package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(new File(rd.readLine()));
        int count = 0;
        int symbol;


        while (inputStream.available() > 0 ) {
            symbol = inputStream.read();
            if (symbol == 44) {
                count++;
            }
        }
        rd.close();
        inputStream.close();
        System.out.println(count);
    }
}
