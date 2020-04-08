package _03_Advanced._02_Files_IO._04_Byte_Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB01_FileInputStream_and_FileOutputStream {

    public static void main(String[] args) {

        try {

            byte[] bytes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            OutputStream os = new FileOutputStream("C:\\MyFiles\\test.txt");

            for (int i = 0; i < bytes.length; i++) {
                os.write(bytes[i]);
            }
            os.close();
            
            InputStream is = new FileInputStream("C:\\MyFiles\\test.txt");
            
            int size = is.available();
            
            for (int i = 0; i < size; i++) {
                System.out.print(is.read() + " ");
            }
            System.out.println();
            is.close();

        } catch (IOException e) {
        }

    }

}
