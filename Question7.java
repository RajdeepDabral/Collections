/*
 *Q7. Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull()
 * and an additional operation getMin() which should return minimum element from the SpecialStack.
 * (Expected complexity O(1))
 * */
package com.company;
import java.lang.reflect.Array;
import java.util.*;

class SpecialStack{
    private LinkedList<Integer> list;
    private int min=-1;
    private int pointer=-1;
    private int totallistsize=-1;

    SpecialStack(Integer size){
        this.list=new LinkedList<Integer>();
        this.totallistsize=size;
    }
    public void push(int data) {
        if ((isFull() ==0) && pointer<totallistsize){
            pointer++;
            list.addLast(data);
            if(pointer==0){
                min=data;
            }else{
                if(min>data){
                    min=data;
                }
            }
        }else{
            System.out.println("Stack is Full!!!!!");
        }
    }

    public int isFull(){
        if(pointer==totallistsize){
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
        int data=0,find=0;
        if(isEmpty()==1){
            data=list.pollLast();
            pointer--;
            if(data==this.min){
                min=list.getFirst();
                for (int i = 1; i <pointer; i++) {
                    find=list.get(i);
                    if(min>find){
                        min=find;
                    }
                }
            }
            System.out.println("Data Deleted "+ " : "  +data);
        }else{
            System.out.println("stack is Empty!!!!");
        }

    }
    public void display() {
        if (isEmpty() == 1) {
            System.out.println("Data in Array ");
            for (int i = 0; i <=pointer; i++) {
                System.out.print(list.get(i)+" -> ");
            }
        }
    }
    public void getMin(){
        System.out.println("Minimum element : "+ this.min);
    }

}
public class Program{
    public static void main(String[] args) {
        SpecialStack st = new SpecialStack(10);

        st.push(40);
        st.push(50);
        st.push(15);
        st.push(4);
        st.push(30);
        st.push(2);

        st.pop();
        st.getMin();

        st.push(150);
        st.push(120);
        st.push(130);
        st.push(3);

        st.pop();
        st.getMin();

        st.push(1);

        st.getMin();
        st.display();
    }
}

