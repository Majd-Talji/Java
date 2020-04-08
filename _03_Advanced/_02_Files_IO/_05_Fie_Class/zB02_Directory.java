package _03_Advanced._02_Files_IO._05_Fie_Class;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_Directory {

    public static void main(String[] args) throws IOException {

        try {

            String websitePath = "C:\\MyFiles\\Talji\\";

            File taljiFolder = new File(websitePath);
            File imagesFolder = new File(websitePath + "images");
            File videosFolder = new File(websitePath + "videos");
            File pathFile = new File(websitePath + "index.php");

            taljiFolder.mkdir();
            imagesFolder.mkdir();
            videosFolder.mkdir();
            pathFile.createNewFile();

            System.out.println("C:\\MyFiles\\Talji contain: ");

            String[] paths = taljiFolder.list();

            for (String path : paths) {
                System.out.println("- " + path);
            }

        } catch (Exception e) {
            System.out.println("There is Exception.");
        }

    }

}
