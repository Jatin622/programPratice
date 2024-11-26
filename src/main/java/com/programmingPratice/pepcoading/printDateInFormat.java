package com.programmingPratice.pepcoading;

import java.text.SimpleDateFormat;
import java.util.Date;

public class printDateInFormat {
    public static void main(String[]args){
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        System.out.println(date);
    }
}
