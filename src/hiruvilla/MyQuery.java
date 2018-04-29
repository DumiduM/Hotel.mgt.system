import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MyQuery {
     public  Connection  getConnection()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hiruvilla","root","");
            return conn;
        }
        
        
        catch(ClassNotFoundException | SQLException e)
                {
                    JOptionPane.showMessageDialog(null, e);
                    return null;
                }
    } 
    public ArrayList<CustomerClass> getData(int Cus_id){

   ArrayList<CustomerClass> list = new ArrayList<CustomerClass>();
   Connection con = getConnection();
   Statement st;
   ResultSet rs; 
    
   try{
      st = con.createStatement();
      rs = st.executeQuery("SELECT `Customer_ID`, `Package_ID`, `Agent_ID`, `PPN`, "
              + "`Name`, `Country`, `Gender`, `Admitted_Date`, `Discharged_Date` FROM `customer` WHERE 'Customer_ID' = +Cus_id+" );
     CustomerClass c;
     
     while(rs.next()){
         c = new CustomerClass(
                 rs.getInt("Customer_ID"),
                                 rs.getInt("Package_ID"),
                                 rs.getInt("Agent_ID"),
                                 
                                 rs.getString("Name"),
                                 rs.getString("Country"),
                                 rs.getString("Gender"),
                                 rs.getInt("PPN")
         );
         
         list.add(c);
     }
   }
   
   catch(SQLException ex){
       Logger.getLogger(MyQuery.class.getName()).log(Level.SEVERE, null,ex);
   }
   return list;    
   }
    
    
}
