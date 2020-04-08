package _01_Basis._10_Arrays._01_Basis;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_Print_Array {
    
    public static void main(String[] args) {
        
        int[] numbers = new int[5];
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println( "numbers[" + i + "]: " + numbers[i] );
        }
        
        numbers[0] = 1000;
        numbers[1] = 2000;
        numbers[2] = 3000;
        numbers[3] = 4000;
        numbers[4] = 5000;
        
        System.out.println();
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "]: " + numbers[i]);
        }
        
    }
    
}
