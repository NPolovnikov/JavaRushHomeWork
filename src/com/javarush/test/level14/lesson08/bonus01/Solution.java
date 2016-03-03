package com.javarush.test.level14.lesson08.bonus01;

import javax.security.auth.login.FailedLoginException;
import javax.security.cert.CertificateException;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        exceptions.add(new IOException());
        exceptions.add(new NullPointerException());
        exceptions.add(new FailedLoginException());
        exceptions.add(new FileSystemAlreadyExistsException());
        exceptions.add(new CertificateException());
        exceptions.add(new HeadlessException());
        exceptions.add(new SQLException());
        exceptions.add(new ArithmeticException());
        exceptions.add(new FileNotFoundException());

        //Add your code here

    }
}
