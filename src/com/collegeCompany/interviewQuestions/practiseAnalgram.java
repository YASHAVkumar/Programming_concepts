package  com.collegeCompany.interviewQuestions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class practiseAnalgram
{
    static Map<String, List<Integer>> result = new HashMap<>();
    public static void groupAnagrams(String[] words)
    {
        List<String> list = Arrays.stream(words)
                .map(s -> Stream.of(s.split("")).sorted()
                        .collect(Collectors.joining()))
                .collect(Collectors.toList());
        /*
        Map<String, List<Integer>> multiMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            multiMap.putIfAbsent(list.get(i), new ArrayList<>());
            multiMap.get(list.get(i)).add(i);
        }

         */
        System.out.println(list);
        result=new HashMap<>();
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] words=new String[n];
        for(int i=0;i<n;i++){
            words[i]=sc.next();
        }
        groupAnagrams(words);
        System.out.println(result);
        /*
        for (String key: result.keySet()) {
            System.out.println(result.get(key).stream()
                    .map(i -> words[i])
                    .collect(Collectors.toList()).toString().replace("[","").replace("]","").replace(",",""));


        }

         */
    }
}