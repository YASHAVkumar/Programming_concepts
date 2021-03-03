package com.collegeCompany.interviewQuestions;

import java.util.*;

public class analgram {
    public static Collection<ArrayList<String>> analgam(ArrayList<String> arr)
    {
        Map<String, ArrayList<String>> map=new TreeMap<>();

      //  String lstr="";

        /*****************************normal approch**********************/
        for(String str:arr)
        {
            char carr[]=str.toCharArray();
            Arrays.sort(carr);
            String fstr= String.valueOf(carr);
          //  System.out.println(fstr);

            if(map.containsKey(fstr))
            {
                 ArrayList<String> llist=map.get(fstr);
                 llist.add(str);
                 map.put(fstr,llist);
            }
             else
            {
                ArrayList<String> list=new ArrayList<>();
                list.add(str);
               map.put(fstr,list);
            }

        }


//        for(var str:map.values())
//        {
//            System.out.println(str);
//        }

    return map.values();}

    public static void analgamnewApproch(ArrayList<String> arr)
    {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:arr)
        {
            int freq[]=new int[26];
            for(int i=0;i<str.length();i++)
            {
                int index=str.charAt(i)-'a';
            freq[index]++;}

            String fstr=" ";
              StringBuilder sr=new StringBuilder();

              for(int i=0;i<26;i++)
                  {  //fstr+=freq[i];fstr+="#";
                      sr.append(freq[i]);
                      sr.append("#");
                  }

/******************short method ha ye add krne ka***************/
                   ArrayList flist=(ArrayList) map.getOrDefault(sr.toString(),new ArrayList<>());
                   flist.add(str);
                   map.put(sr.toString(),flist);
/*****************Long method ha ye add krne ka****************/
//              if(!map.containsKey(fstr))
//              {
//                  ArrayList<String> list=new ArrayList<>();
//                  list.add(str);
//                  map.put(fstr,list);
//              }else
//              {
//                 ArrayList list= (ArrayList) map.get(fstr);
//                 list.add(str);
//                 map.put(fstr,list);
//              }

        }

        for(Map.Entry<String, List<String>> str:map.entrySet())
        System.out.println(str.getValue());
    }
    public static void  main(String args[])   //[eat,tea,tan,nat,numpy,munpy]=>[[eat,tea],[tan,nat],[numpy,munpy]]
    {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("eat");
        arr.add("tan");
        arr.add("tea");
        arr.add("nat");
        arr.add("numpy");
        arr.add("munpy");
       // System.out.println(analgam(arr));
        analgamnewApproch(arr);

    }
}
