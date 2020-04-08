package _03_Advanced._09_Data_Base._03_Classes_Interfaces_DataBase._05_Interface_ResultSetMetaData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class _Connect_DataBase_Type_In_Table_Company {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/company", "root", "");

            PreparedStatement ps = con.prepareStatement("select * from employee");
            
            ResultSet rs = ps.executeQuery();
            
            ResultSetMetaData rsmd = rs.getMetaData();

            System.out.println("First column:  " + rsmd.getColumnName(1) + " (" + rsmd.getColumnTypeName(1) + ")");
            System.out.println("Second column: " + rsmd.getColumnName(2) + " (" + rsmd.getColumnTypeName(2) + ")");
            System.out.println("Third column:  " + rsmd.getColumnName(3) + " (" + rsmd.getColumnTypeName(3) + ")");
            System.out.println("Fourth column: " + rsmd.getColumnName(4) + " (" + rsmd.getColumnTypeName(4) + ")");
            System.out.println("------------------------------------------------------------");
            System.out.println("Total number of columns: " + rsmd.getColumnCount());
            System.out.println("------------------------------------------------------------");
            System.out.println("First column is from the table: " + rsmd.getTableName(1));
            System.out.println("------------------------------------------------------------");
            System.out.println("Is First column have the property AUTOINCEREMENT? " + rsmd.isAutoIncrement(1));
            System.out.println("Is current the datatype of the first column?      " + rsmd.isCurrency(1));
            System.out.println("Is First Column have the property READONLY?       " + rsmd.isReadOnly(1));

            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
