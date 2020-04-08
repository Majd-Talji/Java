package _03_Advanced._02_Files_IO._04_Byte_Streams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB03_DataInputStream_and_BufferedWriter {
    
    public static void main(String[] args) throws IOException{
        
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\MyFiles\\test.txt"));
        
        dos.writeUTF("Majd Talji");
        
        DataInputStream dis = new DataInputStream(new FileInputStream("C:\\MyFiles\\test.txt"));
        
        while (dis.available() > 0) { 
            System.out.println(dis.available());
            String k = dis.readUTF();
            System.out.println(k);
        }
        
    }
    
}
