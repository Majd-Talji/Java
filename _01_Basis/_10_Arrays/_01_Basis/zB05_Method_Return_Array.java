package _01_Basis._10_Arrays._01_Basis;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB05_Method_Return_Array {
    
    public static int[] reverseArray(int[] array){
        
        int[] result = new int[ array.length ];

        for (int i = 0, j = result.length - 1; i < array.length && j >= 0; i++, j--) {
            result[j] = array[i];
        }

        return result;

    }
    
    public static void main(String[] args) {
        
        int[] numbers = { 10, 20, 30, 40, 50 };
        
        int[] reverseNumbers;
        
        reverseNumbers = reverseArray(numbers);
        
        for (int i = 0; i < reverseNumbers.length; i++) {
            System.out.print( reverseNumbers[i] + " " );
        }
        
        System.out.println();
        
    }
    
}
