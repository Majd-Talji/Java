package _03_Advanced._01_User_Input._01_Example_General;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_Input_Notes_Student {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float[] notes = new float[5];
        float avg;
        
        System.out.println("Enter the notes of the following methods.");
        
        try {
            
            System.out.print("Java: ");
            notes[0] = input.nextFloat();
            
            System.out.print("HTML: ");
            notes[1] = input.nextFloat();
            
            System.out.print("PHP: ");
            notes[2] = input.nextFloat();
            
            System.out.print("SQL: ");
            notes[3] = input.nextFloat();
            
            System.out.print("Linux: ");
            notes[4] = input.nextFloat();
            
            avg = (notes[0] + notes[1] + notes[2] + notes[3] + notes[4]) / 5;
            
            if (avg >= 10) {
                System.out.println("Congratulation, your average is: " + avg);
            } else {
                System.out.println("Sorry, you fail! your average is: " + avg);
            }
            
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            input.close();
        }
        
    }
    
}
