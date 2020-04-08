package _03_Advanced._08_Multi_Threading._01_Thread_Class.zB01_RealTime;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class RealTime extends Thread{
    int x = 0;

    @Override
    public void run()  {
        System.out.println(Thread.currentThread());
        while (!Thread.currentThread().isInterrupted()) {   
            
            System.out.printf("Current time: %tr \n", new Date());
            
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
        }
        
    }
    
}
