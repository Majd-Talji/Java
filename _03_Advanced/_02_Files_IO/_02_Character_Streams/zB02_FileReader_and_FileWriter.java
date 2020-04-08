package _03_Advanced._02_Files_IO._02_Character_Streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_FileReader_and_FileWriter {

    public static void main(String[] args) {

        try {

            FileWriter fw = new FileWriter("C:\\MyFiles\\test.txt");
            
            fw.write("first line.\nsecond line.\nthird line.");
            fw.flush();
            fw.close();
            
            FileReader fr = new FileReader("C:\\MyFiles\\test.txt");
            
            int c;
            while ((c = fr.read()) != -1) {                
                System.out.print((char)c);
            }
            System.out.println();
            fr.close();

        } catch (IOException e) {
            System.out.println("There is IOException");
        }

    }

}
