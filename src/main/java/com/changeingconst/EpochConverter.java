package com.changeingconst;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

public class EpochConverter {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String yy=sdf.format(new Date(1389115860000L));
        System.out.println(yy);
    }
}
