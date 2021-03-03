package com.collegeCompany.interviewQuestions;



import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;
public class practiseAnalgram2 {

    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<String,ArrayList<String>> map=new HashMap<>();
        String str;
        for(int i=0;i<n;i++)
        {
            str=sc.next();

            int freq[]=new int[26];
            for(int j=0;j<str.length();j++)
            {
                int index=str.charAt(j)-'a';
                freq[index]++;
            }

            StringBuilder key=new StringBuilder();

            for(int k=0;k<26;k++)
            {
                key.append(freq[k]);
                key.append('#');
            }

            ArrayList<String> list=map.getOrDefault(key.toString(),new ArrayList<>());

            list.add(str);
            list.sort(String::compareTo);
            // System.out.print(list);

            map.put(key.toString(),list);
            // System.out.println(map);
        }

        System.out.println(map);

        //  Stack<ArrayList<String>> stack=new Stack<>();

        //  for(Map.Entry<String,ArrayList<String>> obj:map.entrySet())
        //  {

        //     stack.push(obj.getValue());
        //  }
        //    while(!stack.isEmpty())
        //    {
        //     for(String i:stack.pop())
        //      {
        //         System.out.print(i+" ");
        //      }
        //      System.out.println();
        //    }



    }
}