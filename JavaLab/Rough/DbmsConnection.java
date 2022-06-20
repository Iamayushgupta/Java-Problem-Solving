package com.company.JavaLab.Rough;

import java.sql.*;

public class DbmsConnection {
    String url;
    String username;
    String password;

    public DbmsConnection(String url, String username, String password) {
        super();
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        Connection con =null;
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        con = DriverManager.getConnection(url,username,password);
        System.out.println("Success");
        return con;

    }
}
