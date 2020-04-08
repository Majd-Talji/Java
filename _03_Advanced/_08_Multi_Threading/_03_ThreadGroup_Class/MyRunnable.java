package _03_Advanced._08_Multi_Threading._03_ThreadGroup_Class;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        
        while (!Thread.currentThread().isInterrupted()) {   
            
            System.out.println(Thread.currentThread().getName());
            
        }
        
        
    }
    
}
