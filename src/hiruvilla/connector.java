/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.sql.*;
import javax.swing.*;

public class connector {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/hiruvilla";
    Connection conn = null;
    public static Connection ConnercrDb()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            return conn;
        }
        
        
        catch(ClassNotFoundException | SQLException e)
                {
                    JOptionPane.showMessageDialog(null, e);
                    return null;
                }
    }
}
