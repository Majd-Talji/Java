package _03_Advanced._02_Files_IO._05_Fie_Class;

import java.io.File;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB01_File_Class {

    public static void main(String[] args) {

        File f = null;
        boolean t = true;
        String s1 = "C:\\MyFiles\\input.txt";
        String s2 = "C:/MyFiles/input.txt";

        try {

            f = new File((t) ? s1 : s2);

            if (f.exists()) {
                System.out.println("File name:             " + f.getName());
                System.out.println("File length:           " + f.length());
                System.out.println("File parant path:      " + f.getParent());
                System.out.println("File absolute path:    " + f.getAbsolutePath());
                System.out.println("File read permission:  " + f.canRead());
                System.out.println("File write permission: " + f.canWrite());

                f = new File("C:\\MyFiles");
                if (f.isDirectory()) {
                    System.out.println("\n" + f.getName() + " contains:");
                    File files[] = f.listFiles();
                    for (int i = 0; i < files.length; i++) {
                        System.out.println((i + 1) + ") " + files[i].getName());
                    }
                }
            } else {
                System.out.println("File not exists!");
            }

        } catch (Exception e) {
        }

    }

}
