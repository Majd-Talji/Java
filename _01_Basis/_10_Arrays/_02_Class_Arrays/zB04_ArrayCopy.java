/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _01_Basis._10_Arrays._02_Class_Arrays;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB04_ArrayCopy {
    
    public static void main(String[] args) {
        
        int arr1[] = { 10, 20, 30, 40, 50, 60 };
        int arr2[] = new int[6];
        
        System.arraycopy(arr1, 0, arr2, 0, 6);
        
        System.out.print( "arr2 = ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print( arr2[i] + " ");
        }
        
        System.out.println();
        
    }
    
}
