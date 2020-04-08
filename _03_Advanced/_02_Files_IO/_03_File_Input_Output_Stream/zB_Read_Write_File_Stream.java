package _03_Advanced._02_Files_IO._03_File_Input_Output_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB_Read_Write_File_Stream {
    
    public static void main(String[] args) throws IOException{
        
        FileInputStream in = null;
        FileOutputStream out = null;
        
        try {
            in = new FileInputStream("C:\\MyFiles\\input.mp4");
            out = new FileOutputStream("C:\\MyFiles\\output.mp4");
            int c;
            
            while ((c = in.read()) != -1) {                
                out.write(c);
            }            
        } catch (IOException e) {
            System.out.println("There is IOExeption");
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
