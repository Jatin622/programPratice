package com.programmingPratice.hashmapPepcoading;

import java.sql.Timestamp;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class hg {
    public static void main(String[] args) {
        // Term name (for example, "Trial - 60 Days")
        String termNames = "Trial - 60 Days";

        int daysToAdd = 0;
        String[] parts = termNames.split(" ");

        for (String part : parts) {
            try {
                daysToAdd = Integer.parseInt(part);
            } catch (NumberFormatException e) {
            }
        }
        Date currentDate = new Date();
        System.out.println("Current Date (Timestamp): " + currentDate.getTime());

        long timestamp = currentDate.getTime();

        Date dateFromTimestamp = new Date(timestamp);

        // Output the converted Date
        System.out.println( dateFromTimestamp);

//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(currentDate);
//        calendar.add(Calendar.DAY_OF_MONTH, daysToAdd);
//
//        Date updatedDate = calendar.getTime();
//        System.out.println("Updated Date (after adding " + daysToAdd + " days): " + updatedDate);
    }
}
