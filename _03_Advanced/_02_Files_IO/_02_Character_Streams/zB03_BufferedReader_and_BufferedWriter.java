package _03_Advanced._02_Files_IO._02_Character_Streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB03_BufferedReader_and_BufferedWriter {
    
    public static void main(String[] args) {
        
        try {
            
            FileOutputStream fos = new FileOutputStream("C:\\MyFiles\\test.txt");
            
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-16");
            
            BufferedWriter bw = new BufferedWriter(osw);
            
            bw.write("line 1");
            bw.newLine();
            bw.write("line 2");
            bw.flush();
            bw.close();
            
            FileInputStream fis = new FileInputStream("C:\\MyFiles\\test.txt");
            
            InputStreamReader isr = new InputStreamReader(fis, "UTF-16");
            
            BufferedReader br = new BufferedReader(isr);
            
            int c;
            while ((c = br.read()) != -1) {                
                System.out.print((char)c);
            }
            System.out.println();
            br.close();
            
        } catch (IOException e) {
            System.out.println("There is IOException");
        }
        
    }
    
}
