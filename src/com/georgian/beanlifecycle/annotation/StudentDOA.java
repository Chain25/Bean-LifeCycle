package com.georgian.beanlifecycle.annotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDOA {

    private String Driver= com.mysql.jdbc.Driver;
    private String url="jdbc:mysql://127.0.0.1:3306/ESNew";
    private String password="avi";
    private String username="root";


    public void selectAllRow() throws ClassNotFoundException{
        //load driver
        Class.forName(driver);
        //get a connection
        Connection con =DriverManager.getConnection(url,username,password);

        //execute a query
        Statement stmt = con.createStatement();
        //result set contain all the rows of the tables
        ResultSet resultSet =stmt.executeQuery("SELECT * FROM ESNew.HostelStudentInfo;");
        //iterate through the table
        while(resultSet.next()){
            int studentId = resultSet.getInt(1);
            String studentname = resultSet.getString(2);
            double hostelFee  = resultSet.getDouble(3);
            String foodtype = resultSet.getString(4);

            System.out.println(studentId + " "+ studentname + "  "+hostelFee+ " "+foodtype);
        }

    }
}
