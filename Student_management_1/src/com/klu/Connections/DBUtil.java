package com.klu.Connections;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class DBUtil {

	final static String forNameURL="com.mysql.cj.jdbc.Driver";
    final static String DBURL="jdbc:mysql://@localhost:3306/EP";
    final static String username="root";
    final static String password="Mukesh@123";
    public static Connection DBConnection() throws SQLException, ClassNotFoundException{
        Class.forName(forNameURL);
        Connection con=DriverManager.getConnection(DBURL,username,password);
        return con;
    }     

}
