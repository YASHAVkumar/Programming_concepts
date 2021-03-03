package com.company;

import  com.collegeCompany.interviewQuestions.recurssion;
public class matixproblem {
    public static  void main(String args[]){
         recurssion obj=new recurssion();
         boolean vis[][]=new boolean[3][3];
         obj.findWaysInFour(0,0,3,3,"",vis);

    }
}
