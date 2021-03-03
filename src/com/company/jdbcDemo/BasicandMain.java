package com.company.jdbcDemo;
//implement resource pack

import java.sql.*;

public class BasicandMain {
    public static void main(String[] args){


    try {
        Class.forName("com.mysql.jdbc.Driver") ;

        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/")) {
            System.out.println("connected");
        }
    }
    catch (Exception e)
    {
        System.out.println("file not found");
    }

    }
}
