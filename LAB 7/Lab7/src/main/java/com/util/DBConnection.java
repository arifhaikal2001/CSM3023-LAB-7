package com.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ARIF HAIKAL
 */
public class DBConnection {

    private static Connection myConnection = null;
    private static String myURL = myURL = "jdbc:mysql://localhost:3306/lab7";

    DBConnection() {
        
    }
    
    public static Connection getConnection() throws ClassNotFoundException
    {
        if (myConnection != null)
        {
            return myConnection;
        }
        else
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                myConnection = DriverManager.getConnection(myURL, "root", "admin@123");
            }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return myConnection;
    }
}