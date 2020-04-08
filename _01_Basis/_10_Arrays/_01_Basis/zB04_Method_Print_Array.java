package _01_Basis._10_Arrays._01_Basis;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB04_Method_Print_Array {
    
    public static void printArray( int[] array ){
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] + " " );
        }
    }
    
    public static void main(String[] args) {
        
        int[] numbers = { 10, 20, 30, 40, 50};
        
        printArray(numbers);
        
        System.out.println();
        
        printArray(new int[] {11, 12, 13, 14, 15});
        
        System.out.println();
        
    }
    
}
