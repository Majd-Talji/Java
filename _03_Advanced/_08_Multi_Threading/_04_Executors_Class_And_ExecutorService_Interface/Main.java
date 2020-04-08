package _03_Advanced._08_Multi_Threading._04_Executors_Class_And_ExecutorService_Interface;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        ExecutorService executor = Executors.newFixedThreadPool(5);
        
        for (int i = 0; i <= 5; i++) {
            
            executor.execute(new MyRunnable());
            
        }
        
        executor.shutdown();
        
    }
    
}
