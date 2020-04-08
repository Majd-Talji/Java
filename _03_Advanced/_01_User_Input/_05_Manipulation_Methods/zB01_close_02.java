package _03_Advanced._01_User_Input._05_Manipulation_Methods;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB01_close_02 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String name;
        String job;

        System.out.print("Enter your name: ");
        name = input.nextLine();
        
        input.close();
        
        System.out.print("Enter your job: ");
        job = input.nextLine();

        System.out.println("\n------------ User Info ------------");
        System.out.println("Name: " + name);
        System.out.println("Job : " + job);

    }

}
