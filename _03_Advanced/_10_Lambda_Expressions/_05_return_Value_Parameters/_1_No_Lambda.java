package _03_Advanced._10_Lambda_Expressions._05_return_Value_Parameters;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class _1_No_Lambda {
    
    public static void main(String[] args) {
        
        Operations obj = new Operations() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        
        System.out.println(obj.sum(3, 4));
        
    }
    
}
