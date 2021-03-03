package com.company.collection;
import java.util.*;
public class arrayList {
    public static void main(String[] args){
        ArrayList<String>arrayList= new ArrayList<>();
        arrayList.add("y");
        arrayList.add("a");
        arrayList.add("s");
        arrayList.add("h");
        arrayList.add("a");
        arrayList.add("v");

      /*

        // for each
        for (var obj : arrayList) {
            System.out.print(obj+""); }
        System.out.println();


       // Pre builded
        arrayList.listIterator();

        //iterator
        Iterator itr=arrayList.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+"");
        }
        System.out.println();


        //.set()
        String bar;  //it have return string type previous value
                     // bar = arrayList.set(0,"Don");

       */
    /********************************************Topic to be covered later****************/
                  // Collections.sort(arrayList);
                  //arrayList.sort();
     /***********************************************************/
     /*
        arrayList.toArray();
        //for  .get()
        for(int i=0;i<arrayList.size();i++)
            System.out.print(arrayList.get(i) +" ");
        System.out.println();
         lists obj=new lists();

        //index of , contains size
        System.out.println(arrayList.indexOf("a")+" "+arrayList.contains(obj)+" ");

      */

       ///////////////////////////////////////////////////////////New Array
        List<Integer> list=new ArrayList<>(4);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
      //  System.out.println(list.toString());
      //  System.out.println(list.subList(0,3)); ///////have return type and not have i inc and i1 exclude


         Collection<Integer> collectionList=new ArrayList<>(20);
          collectionList.add(1);
          collectionList.add(2);
          collectionList.add(4);
          collectionList.add(7);

       System.out.println();
            //remove int i and object
     //   System.out.println(list);
         // System.out.println(collectionList);
         //arrayList.listIterator();



    }
}
