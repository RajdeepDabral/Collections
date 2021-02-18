/*
*Q4. Write a program to sort Employee objects based on highest salary using Comparator.
* Employee class{ Double Age; Double Salary; String Name}.
* */
package com.company;
import java.util.*;

class Employee{
    private Double age;
    private Double salary;
    private String name;
    public Employee(Double age , Double salary , String name){
        this.age=age;
        this.salary=salary;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class ComparatorHighestSalary implements Comparator<Employee>{
    public int compare(Employee e1 , Employee e2 ){
        if(e1.getSalary()>e2.getSalary()){
            return -1;
        }else if(e1.getSalary()<e2.getSalary()){
            return 1;
        }
        return 0;
    }
}

public class Main{


    public static void main(String[] args) {
        Employee e1 = new Employee(28.0,52000.0,"Mohit");
        Employee e2 = new Employee(25.0,49000.0,"Rahul");
        Employee e3 = new Employee(24.0,50000.0,"Suraj");
        Employee e4 = new Employee(29.0,51000.0,"Shubham");

        LinkedList<Employee> linkedList = new LinkedList<Employee>();
        linkedList.add(e1);
        linkedList.add(e2);
        linkedList.add(e3);
        linkedList.add(e4);

        Collections.sort(linkedList , new ComparatorHighestSalary());

        System.out.println("Employee Sorted According to Salary");
        Iterator<Employee> itr = linkedList.iterator();
        while(itr.hasNext()){
            System.out.println((Employee)itr.next());
        }

    }
}

