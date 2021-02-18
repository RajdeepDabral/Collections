/*
*Q7. Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull()
* and an additional operation getMin() which should return minimum element from the SpecialStack.
* (Expected complexity O(1))
* */
package com.company;
import java.util.*;

class SpecialStack{
    public int pointer=-1;
    int arr[];
    int size=0;

    SpecialStack(int size){
        System.out.println("Enter Stack size : ");
        this.size=size;
        arr=new int[size];
    }
    public void push(int data) {
        if ((isFull() ==0) && (++pointer<size)) {
            arr[pointer] = data;
        }else{
            System.out.println("Stack is Full!!!!!");
        }
    }

    public int isFull(){
        if(pointer==size){
            return 1;
        }else{
            return 0;
        }
    }

    public int isEmpty(){
        if(pointer==-1){
            return 0;
        }else{
            return 1;
        }
    }
    public void pop(){
        Scanner sc = new Scanner(System.in);
        int data=0;
        if(isEmpty()==1){
            data=arr[pointer];
            pointer--;
            System.out.println("Data Deleted "+ " : "  +data);
        }else{
            System.out.println("stack is Empty!!!!");
        }

    }
    public void display() {
        if (isEmpty() == 1) {
            System.out.println("Data in Array ");
            for (int i = 0; i <pointer; i++) {
                System.out.println(arr[i]);
            }
        }
    }
    public void getMin(){
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        for(int i=0;i<pointer;i++){
            treeSet.add(arr[i]);
        }
        System.out.println("Minimum element "+ treeSet.first());
    }

}
public class Main{
    public static void main(String[] args) {
        SpecialStack st = new SpecialStack(10);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        st.display();

        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();

        st.push(40);
        st.push(50);
        st.push(60);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(90);
        st.push(100);
        st.push(120);
        st.push(80);

        st.push(180);
        st.display();
        st.getMin();
    }
}

