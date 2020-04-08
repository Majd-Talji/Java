package _03_Advanced._09_Data_Base._03_Classes_Interfaces_DataBase._01_Interface_DatabaseMetaData;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class _Tables_In_DataBase {
    
    public static void main(String[] args) {
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/company", "root", "");
            
            DatabaseMetaData dbmd = con.getMetaData();
            
            System.out.println("Driver Name: " + dbmd.getDriverName());
            System.out.println("Driver Version: " + dbmd.getDriverVersion());
            System.out.println("User Name: " + dbmd.getUserName());
            System.out.println("Database URL: " + dbmd.getURL());
            System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
            System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());
            
            String table[] = {"TABL"};
            
            ResultSet rs = dbmd.getTables(null, null, null, table);
            
            System.out.println("\nDatabase Tables names: ");
            
            while (rs.next()) {           
                System.out.println("- " + rs.getString(3));
            }
            
            con.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
