package _01_Basis._10_Arrays._02_Class_Arrays;

import java.util.Arrays;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_sort {
    
    public static void main(String[] args) {
        
        Object arr1[] = { 4, 1, 3, 5, 2 };
        Object arr2[] = { 'c', 'b', 'a', 'd', 'e' };
        
        Arrays.sort( arr1 );
        Arrays.sort( arr2 );
        
        System.out.print( "arr1: " );
        for (Object element : arr1) {
            System.out.print( element + " ");
        }
        
        System.out.println();
        
        System.out.print("arr2: ");
        for (Object element : arr2) {
            System.out.print(element + " ");
        }
        
        System.out.println();
        
    }
    
}
