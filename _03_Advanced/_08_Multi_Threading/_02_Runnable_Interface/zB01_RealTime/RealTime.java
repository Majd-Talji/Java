package _03_Advanced._08_Multi_Threading._02_Runnable_Interface.zB01_RealTime;

import java.util.Date;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class RealTime implements Runnable{

    @Override
    public void run() {
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
