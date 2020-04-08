package _02_OOP._11_Nested_Classes.zB05_Static_Nested_Classes_Import;

import _02_OOP._11_Nested_Classes.zB05_Static_Nested_Classes_Import.A.B;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        B obj = new B();
        
        obj.x = 10;
        obj.printX();
        
        obj.y = 20;
        obj.printY();
        
        A.B.y = 30;
        A.B.printY();

    }

}
