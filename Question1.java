/*
*Q1 Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator,
*  find the sum of the numbers in List.
* */
package com.company;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        float sum=0f;
        List<Float> list = new LinkedList<Float>();
        list.add(150.2f);
        list.add(210.5f);
        list.add(310.6f);
        list.add(490.0f);
        list.add(550.9f);

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            sum=sum+(float)itr.next();
        }
        System.out.println("Sum : "+sum);
    }
}

