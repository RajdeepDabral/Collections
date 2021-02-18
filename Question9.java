/*
*Q9. Write a program to display times in different country format.
* */
package com.company;
import java.text.DateFormat;
import java.util.*;
public class Main{
    public static void main(String[] args) throws Exception{
        Date date = new Date();

        Locale italian = new Locale("it","ch");
        Locale india = new Locale("hi","IN");
        Locale poland = new Locale("pl","PL");
        Locale brazil = new Locale("pt","BR");

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, italian);
        System.out.println("italian: "+ df.format(date));

        df = DateFormat.getDateInstance(DateFormat.FULL, india);
        System.out.println("india: "+ df.format(date));

        df = DateFormat.getDateInstance(DateFormat.FULL, poland);
        System.out.println("poland: "+ df.format(date));

        df = DateFormat.getDateInstance(DateFormat.FULL, brazil);
        System.out.println("brazil: "+ df.format(date));
    }
}

