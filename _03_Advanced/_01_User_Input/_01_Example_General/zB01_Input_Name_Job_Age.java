package _03_Advanced._01_User_Input._01_Example_General;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB01_Input_Name_Job_Age {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        String job;
        int age;

        try {
            System.out.print("Enter a your name: ");
            name = input.nextLine();

            System.out.print("Enter a your job: ");
            job = input.nextLine();

            System.out.print("Enter a your age: ");
            age = input.nextInt();

            System.out.println("\n------------- User Info -------------");
            System.out.println("Name: " + name);
            System.out.println("Job: " + job);
            System.out.println("Age: " + age);
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            input.close();
        }

    }

}
