package _01_Basis._10_Arrays._02_Class_Arrays;

import java.util.Arrays;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB03_fill {

    public static void main(String[] args) {

        Object arr1[] = new Object[5];
        Object arr2[] = {1, 2, 3, 4, 5};

        Arrays.fill(arr1, "java");
        Arrays.fill(arr2, 100);

        System.out.print("arr1 : ");
        for (Object element : arr1) {
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.print("arr2 : ");
        for (Object element : arr2) {
            System.out.print(element + " ");
        }
        
        System.out.println();

    }

}
