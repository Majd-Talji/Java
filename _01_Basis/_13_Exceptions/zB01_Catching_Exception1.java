package _01_Basis._13_Exceptions;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB01_Catching_Exception1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                int[] a = {9, 8, 7, 6, 5};
                System.out.print("Enter Index : ");
                System.out.println(a[input.nextInt()]);
            } catch (Exception e) {
                System.out.println("Exception thrown: " + e);
            }
        }

    }

}
