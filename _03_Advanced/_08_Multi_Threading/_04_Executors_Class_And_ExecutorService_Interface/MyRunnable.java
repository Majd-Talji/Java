package _03_Advanced._08_Multi_Threading._04_Executors_Class_And_ExecutorService_Interface;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        
        for (int i = 0; i <= 3; i++) {
            
            System.out.println(Thread.currentThread().getName() + ", Counter = " + i);
            
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
        }

    }
    
}
