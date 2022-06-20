package com.company.JavaLab.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class dbmsconnction{
    String url;
    String uname;
    String pwd;

    public dbmsconnction(String url, String uname, String pwd) {
        this.url = url;
        this.uname = uname;
        this.pwd = pwd;
    }
    public Connection getConnection() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        Connection con;
        con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();//loads the driver
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/airplanebook","root","");
            con=DriverManager.getConnection(url,uname,pwd);
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
    public void close(Connection con, Statement stmt) throws SQLException {
        stmt.close();
        con.close();
        System.out.println("Connection closed");
    }
}
