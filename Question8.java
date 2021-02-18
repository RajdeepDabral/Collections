/*
*Q8. Write a program to format date as example "21-March-2016"
* */
package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        String datestr = date.format(dateFormat);
        System.out.println(datestr);
    }
}

