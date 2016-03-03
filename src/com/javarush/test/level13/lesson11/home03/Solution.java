package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //add your code here
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        InputStream inStream = new FileInputStream(name);
        OutputStream out = new PrintStream(System.out);

        while (inStream.available() > 0)
        {
            out.write(inStream.read()); //читаем один байт из потока для чтения
        }

        inStream.close();
        scanner.close();
        out.close();
        //закрываем потоки
    }
}
