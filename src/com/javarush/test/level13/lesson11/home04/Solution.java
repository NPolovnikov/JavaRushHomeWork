package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        OutputStream outStream = new FileOutputStream(name);
        String line = scanner.next();
        while (!line.equals("exit")){
            outStream.write(line.getBytes());
            outStream.write(System.lineSeparator().getBytes());
            line = scanner.next();
        }
        outStream.write(line.getBytes());
        outStream.close();
    }
}
