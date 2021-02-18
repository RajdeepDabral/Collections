/*
*Q5. Write a program to sort the Student objects based on Score , if the score are same then sort on First Name .
* Class Student{ String Name; Double Score; Double Age.
* */
package com.company;
import java.util.*;

class Student{
    private Double age;
    private Double score;
    private String name;

    public Student(Double age, Double score, String name) {
        this.age = age;
        this.score = score;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", score=" + score +
                ", name='" + name + '\'' +
                '}';
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class ComparatorHighestSalary implements Comparator<Student>{
    public int compare(Student e1 , Student e2 ){
        if(e1.getScore()>e2.getScore()){
            return -1;
        }else if(e1.getScore()<e2.getScore()){
            return 1;
        }
        else{
            return e1.getName().compareTo(e2.getName());
        }
    }
}

public class Main{


    public static void main(String[] args) {
        Student e1 = new Student(28.0,51.0,"Mohit");
        Student e5 = new Student(21.0,51.0,"Aman");
        Student e6 = new Student(24.0,50.0,"Danish");
        Student e2 = new Student(25.0,49.0,"Rahul");
        Student e3 = new Student(24.0,50.0,"Suraj");
        Student e4 = new Student(29.0,51.0,"Shubham");

        LinkedList<Student> linkedList = new LinkedList<Student>();
        linkedList.add(e1);
        linkedList.add(e2);
        linkedList.add(e3);
        linkedList.add(e4);
        linkedList.add(e5);
        linkedList.add(e6);

        Collections.sort(linkedList , new ComparatorHighestSalary());

        System.out.println("Employee Sorted According to Salary");
        Iterator<Student> itr = linkedList.iterator();
        while(itr.hasNext()){
            System.out.println((Student)itr.next());
        }

    }
}

