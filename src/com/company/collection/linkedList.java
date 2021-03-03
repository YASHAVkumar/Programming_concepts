package com.company.collection;
import  java.util.*;
public class linkedList {
    public static void main(String args[])
    {  //Implementation Double linked list
        Collection<Integer> linkedList=new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        //    System.out.println(linkedList.contains(9)+" "+linkedList);
        List<Integer> list=new LinkedList();
        list.add(2);
        list.add(4);
        list.add(9);
     //   System.out.println(list);
        LinkedList<Integer> list1=new LinkedList<>();
        list1.add(2);           //
        list1.add(0,1);
        list1.add(1,3);
        list1.add(3,7);

        list1.addLast(8);

        Iterator itr=list1.iterator();
        while (itr.hasNext())
            System.out.print(itr.next());
        System.out.println();
         LinkedList<String> obj=new LinkedList<>();
         obj.add("yahs");
         obj.add("yashav");
         obj.add("kumar");
        System.out.println(obj.element());
        System.out.println(obj.peekLast());
        System.out.println(obj);

    }
}
