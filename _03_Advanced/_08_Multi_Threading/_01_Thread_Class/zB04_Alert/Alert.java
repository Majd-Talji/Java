package _03_Advanced._08_Multi_Threading._01_Thread_Class.zB04_Alert;

import java.awt.Toolkit;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Alert extends Thread {
    
    private boolean isStarted = false;

    @Override
    public void start() {
        
        if (isStarted == false) {
            super.start();
            isStarted = true;
        } else {
            resume();
        }
        
    }

    @Override
    public void run() {
        
        while (!this.isInterrupted()) {
            
            try {
                Toolkit.getDefaultToolkit().beep();
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
        }
        
    }
    
}
