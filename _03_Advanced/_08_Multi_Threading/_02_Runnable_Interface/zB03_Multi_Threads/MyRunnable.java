package _03_Advanced._08_Multi_Threading._02_Runnable_Interface.zB03_Multi_Threads;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class MyRunnable implements Runnable{
    
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        
        while (!Thread.currentThread().isInterrupted()) {   
            
            System.out.println(name);
            
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
        }
        
    }
    
}
