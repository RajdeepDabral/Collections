/*
*Q3. Write a method that takes a string and print the number of occurrence of each character characters in the string.
* */
package com.company;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void uniqueChar(String str){
        HashMap<Character , Integer> hashmap = new HashMap<Character , Integer>();
        int value=0;
        for(int i=0;i<str.length();i++){
            if(hashmap.containsKey(str.charAt(i))){
                value=hashmap.get(str.charAt(i));
                hashmap.put(str.charAt(i),++value);
            }else{
                value=0;
                hashmap.put(str.charAt(i),++value);
            }
        }
        for(Map.Entry<Character,Integer> hash: hashmap.entrySet()){
            System.out.println(hash.getKey()+" : "+hash.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str= sc.nextLine();
        Main.uniqueChar(str);
    }
}

