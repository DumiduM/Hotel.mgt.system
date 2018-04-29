


import java.sql.*;


public class test {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/hiruvilla";
    
    public static void main(String[] args) {
        
        Connection conn = null;
        
        try
        {
             conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
             System.out.println("Connected");
            
            
        }
        
        catch(SQLException e)
        {
            System.err.println(e);
        }
    }
    
}
