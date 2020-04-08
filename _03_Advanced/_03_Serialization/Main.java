package _03_Advanced._03_Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        Editor e = new Editor();

        // "./user-prefrences.ser"
        if (new File("C:\\MyFiles\\user-prefrences.ser").exists()) {

            try {

                FileInputStream fis = new FileInputStream("C:\\MyFiles\\user-prefrences.ser");

                ObjectInputStream ois = new ObjectInputStream(fis);

                e = (Editor) ois.readObject();

                fis.close();
                ois.close();

                System.out.println("Deserialized data has been created in the memory");
                System.out.println("Language:      " + e.language);
                System.out.println("Encoding:      " + e.encoding);
                System.out.println("Font size:     " + e.fontSize);
                System.out.println("Font Family:   " + e.fontfamily);
                System.out.println("Auto save:     " + e.autoSave);
                System.out.println("Direction:     " + e.direction);
                System.out.println("Auto Complete: " + e.autoComplete);
                System.out.println("Serial Version UID: " + e.serialVersionUID);
                System.out.println();

            } catch (IOException | ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            }

        }

        try {

            e.language = "arabic";
            e.encoding = "utf-8";
            e.fontSize = "12pt";
            e.fontfamily = "tahoma";
            e.autoSave = true;
            e.direction = "right to left";
//            e.autoComplete = "";

            FileOutputStream fos = new FileOutputStream("C:\\MyFiles\\user-prefrences.ser");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(e);

            oos.close();
            fos.flush();
            fos.close();

            System.out.println("Serialized data has been saved in the project in a file called user-prefrences.ser");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
