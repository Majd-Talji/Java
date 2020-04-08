package _03_Advanced._02_Files_IO._01_Reader_Writer_Files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB_Read_Write_File {
    
    public static void main(String[] args) throws IOException {
        
        FileReader in = null;
        FileWriter out = null;
        
        try {
            in = new FileReader("C:\\MyFiles\\input.txt");
            out = new FileWriter("C:\\MyFiles\\output.txt");
            int c;
            
            while ((c = in.read()) != -1) {                
                out.write(c);
            }
        } catch (IOException e) {
            System.out.println("There is IOException!");
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
        
    }
    
}
