package com.changeingconst;

import java.time.LocalDateTime;
import java.util.Calendar;

public class BoardcaseData {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DATE)-1;
        calendar.set(year, month, day, 6 , 0, 0);
        System.out.println( calendar.getTime().toInstant().getEpochSecond());
    }
}
