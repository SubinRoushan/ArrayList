package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(4);
        list.add(0,20);//replace index value

        System.out.println(list);

        //copy one arraylist to another arraylist
        ArrayList<Integer> list1=new ArrayList<>();
        list1.addAll(list);
        list1.add(5);
        System.out.println(list1);

        //get the element for list1
        System.out.println(list1.get(0));

        //remove the index value
        list.remove(1);
        System.out.println(list);

        //this will remove element
        list.remove(Integer.valueOf(4));
        System.out.println(list);

        //remove all the element
//        list.clear();
//        System.out.println(list);

        //update the index value
        list.set(1,10000);
        System.out.println(list);

        //check the element is present or not
        System.out.println(list.contains(10000));

        //Print the value one by one
        for(int i=0;i< list.size();i++)
        {
            System.out.println("Elements are : "+ list.get(i));
        }


        //Print the value one by one
        for (Integer ele:list) {
            System.out.println("Element are : "+ ele);
        }

        //Print the value one by one
        Iterator<Integer> it=list.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
            return;
        }

    }
}