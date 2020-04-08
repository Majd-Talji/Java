package _01_Basis._10_Arrays._02_Class_Arrays;

import java.util.Arrays;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB01_equals {
    
    public static void main(String[] args) {
        
        Object arr1[] = { 0, 1, 2, 3, 4, 5 };
        Object arr2[] = { 0, 1, 2, 3, 4, 5 };
        Object arr3[] = { 0, 1, 2, 3 };
        
        System.out.println( Arrays.equals(arr1, arr2) );
        System.out.println( Arrays.equals(arr1, arr3) );
        
    }
    
}
