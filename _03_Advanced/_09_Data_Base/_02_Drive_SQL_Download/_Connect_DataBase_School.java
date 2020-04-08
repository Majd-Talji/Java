package _03_Advanced._09_Data_Base._02_Drive_SQL_Download;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class _Connect_DataBase_School {
    
    public static void main(String[] args) {
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/school", "root", "");
            
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery("select name from students");
            
            while (rs.next()) {                
                System.out.println(rs.getString("name"));
            }
            
            con.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
