package _01_Basis._13_Exceptions;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB03_finally {

    public static void main(String[] args) {

        String s = "123456789200002030405555555555551607180925212423";
        int a;

        try {
            System.out.println("s.charAt(28): " + s.charAt(28));
            a = Integer.parseInt(s);
        } catch (StringIndexOutOfBoundsException e1) {
            System.out.println("Index is not exist in the string");
        } catch (NumberFormatException e2) {
            System.out.println("Can't convert 's' to a number because is to long!");
        } catch (Exception e3) {
            System.out.println("Exception thrown: " + e3);
        } finally {
            System.out.println("finally codes always execute");
        }
        
        System.out.println("The program still work properly");

    }

}
