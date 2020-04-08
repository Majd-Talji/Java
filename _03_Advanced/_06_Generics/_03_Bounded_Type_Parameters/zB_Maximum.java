package _03_Advanced._06_Generics._03_Bounded_Type_Parameters;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB_Maximum {

    public static <N extends Number> N max(N x, N y) {

        if (x.doubleValue() > y.byteValue()) {
            return x;
        } else {
            return y;
        }
        
    }
    
    public static <N extends Number> N max(N x, N y, N z) {
        
        return max(max(x, y), z);
        
    }

    public static void main(String[] args) {
        
        System.out.println(max(3, 7));
        
        System.out.println(max(5.5F, 8F));
        
        System.out.println(max(6.9D, 8L));
        
        System.out.println(max(10, 15, 5));
        
        System.out.println(max(11, 12.5F, 17.8D));

    }

}
