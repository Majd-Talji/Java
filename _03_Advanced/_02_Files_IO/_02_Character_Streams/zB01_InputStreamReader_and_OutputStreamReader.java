package _03_Advanced._02_Files_IO._02_Character_Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB01_InputStreamReader_and_OutputStreamReader {
    
    public static void main(String[] args) {
        
        try {
            
            FileOutputStream fos = new FileOutputStream("C:\\MyFiles\\test.txt");
            
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-16");
            
            // الترميز UTF-16 يجعلك تخزن البيانات في جميع لغات العالم
            osw.write("UTF-16 codec makes you store data in all languages of the world.");
            osw.flush();
            osw.close();
            // end Write
            
            FileInputStream fis = new FileInputStream("C:\\MyFiles\\test.txt");
            
            InputStreamReader isr = new InputStreamReader(fis, "UTF-16");
            
            int c;
            while ((c = isr.read()) != -1) {                
                System.out.print((char)c);
            }
            System.out.println();
            isr.close();
            
        } catch (IOException e) {
            System.out.println("There is IOException");
        }
        
    }
    
}
