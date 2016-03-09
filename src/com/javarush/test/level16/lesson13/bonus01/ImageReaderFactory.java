package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by npolovnikov on 09.03.16.
 */
public class ImageReaderFactory
{
    public static ImageReader getReader(ImageTypes imageTypes) throws IllegalArgumentException
    {
        if (imageTypes == ImageTypes.BMP) return new BmpReader();
//        else
        if (imageTypes == ImageTypes.JPG) return new JpgReader();
//        else
        if (imageTypes == ImageTypes.PNG) return new PngReader();
//        else
            throw new IllegalArgumentException("Неизвестный тип картинки");

    }

}