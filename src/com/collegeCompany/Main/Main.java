package com.collegeCompany.Main;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        String[] arr = new String[100];
        for(int j=0;j<=arr.length;j++) {
            arr[j]=sc.next();
            String inp = arr[j];
            if(inp.length()<=8) {
                for(int i=0; i<=inp.length() ;i++) {
                    stack.push(i+1);
                    if(i==inp.length()|| inp.charAt(i)=='I') {
                        while(!stack.isEmpty()) {
                            int popped = stack.pop();
                            System.out.print(popped);
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
