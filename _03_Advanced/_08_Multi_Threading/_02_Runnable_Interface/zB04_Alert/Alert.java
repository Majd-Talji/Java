package _03_Advanced._08_Multi_Threading._02_Runnable_Interface.zB04_Alert;

import java.awt.Toolkit;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Alert implements Runnable{
    
    private boolean isStarted = false;

    @Override
    public void run() {
        
        while (!Thread.currentThread().isInterrupted()) {
            
            try {
                Toolkit.getDefaultToolkit().beep();
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
        }
        
    }
    
}
