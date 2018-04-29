/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiruvilla;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author kalpa
 */
public class javaconnect {
    public static Connection ConnecrDb()
    {
    try
    {
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hiru_villa3","root","");
   // JOptionPane.showMessageDialog(null,"Conection Stablish");  
    return conn;
    }catch(Exception e)
    {
          JOptionPane.showMessageDialog(null,e); 
    return null;
    }
        
    }
    
}
