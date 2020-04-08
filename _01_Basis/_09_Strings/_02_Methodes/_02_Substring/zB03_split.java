/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _01_Basis._09_Strings._02_Methodes._02_Substring;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB03_split {
    
    public static void main(String[] args) {
        
        String str = "Welcome to Majd Talji, best site for learing";
        
        String[] parts = str.split(" ");
        
        String part1 = parts[0];
        String part2 = parts[1];
        String part3 = parts[2];
        String part4 = parts[3];
        String part5 = parts[4];
        String part6 = parts[5];
        String part7 = parts[6];
        String part8 = parts[7];
        
        System.out.println( part1 );
        System.out.println( part2 );
        System.out.println( part3 );
        System.out.println( part4 );
        System.out.println( part5 );
        System.out.println( part6 );
        System.out.println( part7 );
        System.out.println( part8 );
        
        for (int i = 0; i < parts.length; i++) {
            System.out.print( parts[i] + "-");
        }
        System.out.println();
        
    }
    
}
