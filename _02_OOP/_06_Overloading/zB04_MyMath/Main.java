/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _02_OOP._06_Overloading.zB04_MyMath;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        MyMath2 m = new MyMath2();
        
        System.out.println("The max number is: " + m.max(25, 14));
        System.out.println("The max number is: " + m.max(25, 14, 35));
        
    }
    
}
