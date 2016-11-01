package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] months = new String[12];
        months[0] = "JAN";
        months[1] = "FEB";
        months[2] = "MAR";
        months[3] = "APR";
        months[4] = "MAY";
        months[5] = "JUN";
        months[6] = "JUL";
        months[7] = "AUG";
        months[8] = "SEP";
        months[9] = "OCT";
        months[10] = "NOV";
        months[11] = "DEC";


        String str = reader.readLine();

        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("MM/dd/yyyy");
        Date date = format.parse(str);
        int month = date.getMonth();
        String day = str.substring(3, 5);
        String year = str.substring(6, 10);

        System.out.println(months[month] + " " + day + ", " + year);
    }
}
