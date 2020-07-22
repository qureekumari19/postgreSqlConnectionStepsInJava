package com.connect;
import java.sql.Connection;
import java.sql.DriverManager;
public class connect {
    public static void main(String args[])
    {
        try
        {
            String url="jdbc:postgresql://localhost:5432/project1";
            String user="quree";
            String pass= "quree";
            System.out.println("Database connection started");
            Class.forName("org.postgresql.Driver");
            System.out.println("step 1 completed");
            Connection con= DriverManager.getConnection(url,user,pass);
            System.out.println("Database connection stopped");
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("Database connection failed");
        }
    }
}

