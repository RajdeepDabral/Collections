/* Q9. Write a program to display times in different country format. */
package com.company;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args) throws Exception{
        System.out.println("-----Current time of a different time zone using LocalTime-----");
        ZoneId zoneId = ZoneId.of("America/Los_Angeles");
        LocalTime localTime=LocalTime.now(zoneId);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formattedTime=localTime.format(formatter);
        System.out.println("Current time of the day in Los Angeles: " + formattedTime);


        zoneId = ZoneId.of("Asia/Kolkata");
        localTime=LocalTime.now(zoneId);
        formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        formattedTime=localTime.format(formatter);
        System.out.println("Current time of the day in India: " + formattedTime);

    }
}
