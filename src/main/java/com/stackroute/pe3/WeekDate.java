package com.stackroute.pe3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class WeekDate {
    public boolean startDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(simpleDateFormat.format(calendar.getTime()));
        String s1 = simpleDateFormat.format(calendar.getTime());
        if (s1.equals("Mon 16/12/2019"))
            return true;
        else
            return false;

    }

    public boolean endDate() {
        Calendar calendar = Calendar.getInstance();
        String string = "";
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");
        calendar.add(Calendar.DATE, 6);
        //  System.out.println( c.add(Calendar.DATE,1));
        string = (simpleDateFormat.format(calendar.getTime()));
        if (string.equals("Sun 22/12/2019"))
            return true;
        else
            return false;

    }

}