/*
*Q6. Print the elements of an array in the decreasing frequency if 2 numbers have same frequency
* then print the one which came first.
* */
package com.company;
import java.util.*;
public class Main{

    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(9);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(9);
        HashMap<Integer , Integer> hashMap = new HashMap<>();
        int value=0;
        for(int i=0;i<arrayList.size();i++){
            if(hashMap.containsKey(arrayList.get(i))){
                value=hashMap.get(arrayList.get(i));
                hashMap.put(arrayList.get(i) , ++value);
            }else{
                value=0;
                hashMap.put(arrayList.get(i),++value);
            }
        }
        for(Map.Entry<Integer , Integer> map : hashMap.entrySet()){
            System.out.println(map.getKey()+" : "+map.getValue());
        }

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for(int i=0;i<arrayList.size();i++){
            linkedHashSet.add(arrayList.get(i));
        }

        Iterator<Integer> itr =linkedHashSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        int intkey=0; int intvalue=0;
        LinkedHashMap<Integer , Integer> updatedlinkedHashMap = new LinkedHashMap<Integer , Integer>();
        for (Map.Entry<Integer, Integer> outer : hashMap.entrySet()) {
//            System.out.println(outer.getKey()+" : "+outer.getValue());
              intkey=outer.getKey();
              intvalue=outer.getValue();
              int maxkey=0,maxvalue=0;
            for (Map.Entry<Integer, Integer> inner : hashMap.entrySet()) {
                if(intkey== inner.getKey() || updatedlinkedHashMap.containsKey(intkey)){
                    continue;
                }else{
                    if(intvalue<=inner.getValue()){
                        maxkey= inner.getKey();
                        maxvalue= inner.getValue();
                    }
                }
                //System.out.println(inner.getKey()+" : "+inner.getValue());

            }
            updatedlinkedHashMap.put(maxkey , maxvalue);
        }

        for(Map.Entry<Integer , Integer> updated : updatedlinkedHashMap.entrySet()){
            System.out.println(updated.getKey()+" : "+updated.getValue());
        }

    }
}

//2 2 4 4 5 5 5 5 8 9 9
