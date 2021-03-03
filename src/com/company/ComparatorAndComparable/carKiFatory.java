package com.company.ComparatorAndComparable;

import java.util.Arrays;
import java.util.Comparator;

public class carKiFatory  {
    public static <T extends Comparable<T>> void bubblesort(T[] arr)
    {
      for(int i=0;i<arr.length;i++)
      {
          for (int j=0;j<arr.length-1-i;j++)
          {
              if(arr[j].compareTo(arr[j+1])>0)
              {
                  T temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
              }
          }
      }
    }
    public static void main(String[] args) {
        Car[] obj=new Car[4];
        obj[0]=new Car(100,"birst",420);
        obj[1]=new Car(100,"cecond",42340);
        obj[2]=new Car(123400,"airst",420);
        obj[3]=new Car(20240,"decond",42340);
       // bubblesort(obj);
        int a=1;
        Arrays.sort(obj, new Comparator<Car>() {
            @Override
            public int compare(Car o, Car t1) {

                 if(o.price==t1.price)
                    if(o.name.compareTo(t1.name)>0)
                        return 1;

                 return (int) (t1.price-o.price);
            }

            @Override
            public boolean equals(Object o) {
                return false;
            }
        });

     for(int i=0;i< obj.length;i++)
          System.out.println(obj[i]);
    }
}
