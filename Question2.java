/*
*Q2. Write a method that takes a string and returns the number of unique characters in the string.
* */
package com.company;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main{
    public static HashSet<Character> uniqueChar(String str){
        HashSet<Character> hashset = new HashSet<Character>();
        for(int i=0;i<str.length();i++){
            hashset.add(str.charAt(i));
        }
        return hashset;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str= sc.nextLine();

        HashSet<Character> hashSet =Main.uniqueChar(str);
        System.out.println("Unique Character");
        Iterator<Character> itr = hashSet.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

    }
}

