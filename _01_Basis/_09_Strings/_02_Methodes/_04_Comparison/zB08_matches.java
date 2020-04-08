/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _01_Basis._09_Strings._02_Methodes._04_Comparison;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB08_matches {
    
    public static void main(String[] args) {
        
        String str= "welcome to Majd Talji";
        
        System.out.println( str.matches("Majd") );
        System.out.println( str.matches("welcome(.*)") );
        System.out.println( str.matches("(.*)Majd(.*)" ));
        
    }
    
}
