package com.company.JavaLab.JDBC;
import java.sql.*;

public class student{
    String name,regno;
    float cgpa;
    int age;
    boolean DayScholar;

    public student(String name, String regno, float cgpa, int age, boolean DayScholar) {
        this.name = name;
        this.regno = regno;
        this.cgpa = cgpa;
        this.age = age;
        this.DayScholar = DayScholar;
    }
    public void createtable() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        dbmsconnction dbmscon=new dbmsconnction("jdbc:mysql://localhost:3306/student","root","");
        Connection con=dbmscon.getConnection();
        String sql="create table studdetail (name varchar(20),regno varchar(20),cgpa float(2),age int,DayScholar bool);";
        PreparedStatement stmt=con.prepareStatement(sql);
        boolean i=stmt.execute();
    }
    public void insertdata() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        dbmsconnction dbmscon=new dbmsconnction("jdbc:mysql://localhost:3306/student","root","");
        Connection con=dbmscon.getConnection();
        String sql="insert into studdetail values(?,?,?,?,?);";
        PreparedStatement stmt=con.prepareStatement(sql);
        stmt.setString(1,name);
        stmt.setString(2,regno);
        stmt.setFloat(3,cgpa);
        stmt.setInt(4,age);
        stmt.setBoolean(5,DayScholar);
        int i=stmt.executeUpdate();
    }
    public void fetchdatajoin() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        dbmsconnction dbmscon=new dbmsconnction("jdbc:mysql://localhost:3306/student","root","");
        Connection con=dbmscon.getConnection();
        String sql="select * from studdetail where regno like '18%';";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        System.out.println("\nStudents who joined in 2018:");
        while(rs.next()){
            System.out.println(rs.getString(1)+"  "+rs.getString(2));
        }
        sql="select * from studdetail where age between 18 and 20;";
        stmt=con.createStatement();
        rs=stmt.executeQuery(sql);
        System.out.println("\nStudents between age 18 and 20:");
        while(rs.next()){
            System.out.println(rs.getString(1)+"  "+rs.getInt(4));
        }
        sql="select * from studdetail where cgpa<5;";
        stmt=con.createStatement();
        rs=stmt.executeQuery(sql);
        System.out.println("\nStudents with CGPA less than 5:");
        while(rs.next()){
            System.out.println(rs.getString(1)+"  "+rs.getFloat(3));
        }
        sql="select * from studdetail where DayScholar = False;";
        stmt=con.createStatement();
        rs=stmt.executeQuery(sql);
        System.out.println("\nStudents who are not Day Scholars:");
        while(rs.next()){
            System.out.println(rs.getString(1)+"  "+rs.getString(2));
        }
        sql="select * from studdetail where regno like '19%' and DayScholar = True;";
        stmt=con.createStatement();
        rs=stmt.executeQuery(sql);
        System.out.println("\nStudents from 2019 batch who are Day Scholars:");
        while(rs.next()){
            System.out.println(rs.getString(1)+"  "+rs.getString(2));
        }
    }
}