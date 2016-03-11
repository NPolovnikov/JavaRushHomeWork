package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        switch (args[0]){
            case "-e": {encoding(args[1], args[2]); break;}
            case "-d": {decoding(args[1], args[2]); break;}
        }
    }

    private static void decoding(String arg, String s) throws IOException
    {
        FileInputStream in = new FileInputStream(arg);
        byte[] bytes = new byte[in.available()];
        byte[] newByte = new byte[in.available()];
        in.read(bytes);
        for (int i = 0; i < bytes.length; i++){
            byte b = (byte) (bytes[i] + 1);
            newByte[i] = b;
        }
        in.close();
        FileOutputStream out = new FileOutputStream(s);
        out.write(newByte);
    }

    private static void encoding(String arg, String s) throws IOException
    {
        FileInputStream in = new FileInputStream(arg);
        byte[] bytes = new byte[in.available()];
        byte[] newByte = new byte[in.available()];
        in.read(bytes);
        for (int i = 0; i < bytes.length; i++){
            byte b = (byte) (bytes[i] - 1);
            newByte[i] = b;
        }
        in.close();
        FileOutputStream out = new FileOutputStream(s);
        out.write(newByte);
    }

}
