/*
*Q6. Print the elements of an array in the decreasing frequency if 2 numbers have same frequency
* then print the one which came first.
* */
package com.company;
import java.util.*;

class NumberFrequency{
    private int data;
    private int index;
    private int frequency;

    public NumberFrequency(int data, int index, int frequency) {
        this.data = data;
        this.index = index;
        this.frequency = frequency;
    }

    public int getData() {
        return data;
    }

    public int getIndex() {
        return index;
    }

    public int getFrequency() {
        return frequency;
    }

}
class CompareNumber implements Comparator<NumberFrequency>{

    @Override
    public int compare(NumberFrequency t1, NumberFrequency t2) {
        if(t1.getFrequency()>t2.getFrequency()){
            return -1;
        }else if(t1.getFrequency()<t2.getFrequency()){
            return 1;
        }else{
            if(t1.getIndex()>t2.getIndex()){
                return 1;
            }else if(t1.getIndex()<t2.getIndex()){
                    return -1;
            }
        }
        return 0;
    }
}

public class Main{

    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(8);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(8);
        HashMap<Integer , Integer> hashMap = new HashMap<>();
        int value=0;
        ArrayList<NumberFrequency> mainlist = new ArrayList<NumberFrequency>();

        for(int i=0;i<arrayList.size();i++){
            if(hashMap.containsKey(arrayList.get(i))){
                value=hashMap.get(arrayList.get(i));
                hashMap.put(arrayList.get(i) , ++value);
            }else{
                value=0;
                hashMap.put(arrayList.get(i),++value);
            }
        }


        int intkey=0,intvalue=0,intindex=-1;
        for(Map.Entry<Integer , Integer> map : hashMap.entrySet()){
            intkey = map.getKey();
            intvalue = map.getValue();
            System.out.println(intkey+" : "+intvalue);
            mainlist.add(new NumberFrequency(intkey , arrayList.indexOf(intkey) , intvalue));
        }
        Collections.sort(mainlist , new CompareNumber());
        Iterator<NumberFrequency> itr = mainlist.iterator();
        NumberFrequency demo=null;

        System.out.println();

        while(itr.hasNext()){
            demo=itr.next();
            for(int i=0;i<demo.getFrequency();i++){
                System.out.print(demo.getData()+" ");
            }
        }

        System.out.println();

    }
}
