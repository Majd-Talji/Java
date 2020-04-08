package _03_Advanced._04_Data_Structue._05_Class_Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Properties;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB03_put_list_Methods_PrintWriter {

    public static void main(String[] args) {

        Properties names = new Properties();

        names.put("Majd", "مجد");
        names.put("Ahmad", "أحمد");
        names.put("Ibrahim", "إبراهيم");
        names.put("Samer", "سامر");
        names.put("Mohamad", "محمد");
        names.put("Moustafa", "مصطفى");
        names.put("Hala", "هالة");
        names.put("Rana", "رنا");

        try {

            PrintWriter fw = new PrintWriter("C:\\MyFiles\\ar-en names.txt", "UTF-16");

            names.list(fw);

            fw.flush();
            fw.close();

        } catch (IOException e) {
            System.out.println("There is IOException!");
        }

        names = null;
        names = new Properties();
        try {

            FileInputStream fis = new FileInputStream("C:\\MyFiles\\ar-en names.txt");
            InputStreamReader isr = new InputStreamReader(fis, "UTF-16");

            names.load(isr);

            System.out.println(names);

            //------------------------------
            Enumeration keys = names.keys();

            Enumeration values = names.elements();

            System.out.println("---------------------");
            System.out.println("Englich \t | Arabic");
            System.out.println("---------------------");

            while (keys.hasMoreElements()) {
                System.out.println(keys.nextElement() + "\t | " + values.nextElement());
            }
            System.out.println("---------------------\n");
            //------------------------------

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
