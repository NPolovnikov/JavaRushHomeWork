package com.javarush.test.level18.lesson10.home07;

/* Поиск данных внутри файла
Считать с консоли имя файла
Найти в файле информацию, которая относится к заданному id, и вывести ее на экран в виде, в котором она записана в файле.
Программа запускается с одним параметром: id (int)
Закрыть потоки. Не использовать try-with-resources

В файле данные разделены пробелом и хранятся в следующей последовательности:
id productName price quantity

где id - int
productName - название товара, может содержать пробелы, String
price - цена, double
quantity - количество, int

Информация по каждому товару хранится в отдельной строке
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(System.in);
        String fileName1 = sc.nextLine();
        sc.close();
        Scanner in = new Scanner(new FileInputStream(fileName1));
        in.useLocale(Locale.ENGLISH);
        int idToFind = Integer.parseInt(args[0]);
        while (in.hasNext()) {
            String s = in.nextLine();
            String strId = s.substring(0, s.indexOf(' '));
            int id = Integer.parseInt(strId);
            if (id == idToFind) {
                System.out.println(s);
            }
        }
        in.close();
    }
}
